package com.codetreatise.controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import com.codetreatise.config.StageManager;
import com.codetreatise.service.LibraryService;
import com.codetreatise.service.UserService;
import com.codetreatise.view.FxmlView;
import com.codetreatise.config.MyBeanID;
import javafx.event.ActionEvent;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * @author Mateusz Toczek & Beata Korzeniewska
 * @since 08-01-2023
 */

@Controller
public class LoginController implements Initializable{

	public String Sesiontype;
	@Autowired
	private LibraryService libraryService;
	
	@Autowired
	private MyBeanID myBean;

	@FXML
    private Button btnLogin;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    private Label lblLogin;
    
    @Autowired
    private UserService userService;
    
    @Lazy
    @Autowired
    private StageManager stageManager;
        
	@FXML
    private void login(ActionEvent event) throws IOException{
		connect(getUsername(),getPassword());   	
    			
    }
	
	
	 public void connect(String username, String password) {
        try (Socket socket = new Socket("localhost", 4899);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {


            out.println(username + " " + password);
            System.out.println(username + " " + password);
            String response = in.readLine();
            String userRole=response;
    		myBean.setRoleUser(userRole);
            if (userRole.contains("Admin")) {
    			myBean.setIdLibrary(libraryService.find(userService.findByEmail(getUsername()).getIdLibrary()).getId());
    			stageManager.newScene(FxmlView.MAINADMIN);
    		}
    		if (userRole.contains("User")) {
    			myBean.setIdLibrary(libraryService.find(userService.findByEmail(getUsername()).getIdLibrary()).getId());
    			stageManager.newScene(FxmlView.MAINWORKER);
    		}
    		if (userRole.contains("Owner")) {
    			myBean.setIdLibrary(libraryService.find(userService.findByEmail(getUsername()).getIdLibrary()).getId());
    			stageManager.newScene(FxmlView.MAINOWNER);
    		}
    		else
    		{
    			lblLogin.setText("Login Failed.");
    		}
        } catch (IOException e) {
        }
    }
	
	public String getPassword() {
		return password.getText();
	}

	public String getUsername() {
		return username.getText();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

}
