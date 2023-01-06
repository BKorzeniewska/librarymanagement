package project.librarymanagement.librarymanagement.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import project.librarymanagement.librarymanagement.authors.Author;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/1")
    public User getUserId() {return userRepository.getOnId(1);}
    @GetMapping("/user")
    public List<User> getUserAll() {return userRepository.getAll();}
    @PostMapping("/user/insert/")
    public int addUsers(@RequestBody List<User> users){
        userRepository.save(users);
        return 1;
    }
}
