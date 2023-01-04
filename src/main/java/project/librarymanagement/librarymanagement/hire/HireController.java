package project.librarymanagement.librarymanagement.hire;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.librarymanagement.librarymanagement.authors.Author;

import java.util.List;

@RestController
public class HireController {

    @Autowired
    HireRepository hireRepository;
    @GetMapping("/hire/{id}")
    public Hire getHireId(@PathVariable("id")int id) {return hireRepository.getOnId(id);}
    @GetMapping("/hire")
    public List<Hire> getHireAll() {return hireRepository.getAll();}

}
