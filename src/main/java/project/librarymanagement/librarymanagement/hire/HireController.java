package project.librarymanagement.librarymanagement.hire;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import project.librarymanagement.librarymanagement.reader.ReaderRepository;

import java.util.List;

@RestController
public class HireController {

    @Autowired
    HireRepository hireRepository;
    @GetMapping("/hire/{id}")
    public Hire getHireId(@PathVariable("id")int id)
    {   Hire hire=hireRepository.getOnId(id);
        return hire;}
    @GetMapping("/hire")
    public List<Hire> getHireAll() {return hireRepository.getAll();}
}
