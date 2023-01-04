package project.librarymanagement.librarymanagement.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
