package project.librarymanagement.librarymanagement.hire;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HireController {

    @Autowired
    HireRepository hireRepository;
    @GetMapping("/hire/1")
    public Hire getHireId() {return hireRepository.getOnId(1);}
    @GetMapping("/hire")
    public List<Hire> getHireAll() {return hireRepository.getAll();}
}
