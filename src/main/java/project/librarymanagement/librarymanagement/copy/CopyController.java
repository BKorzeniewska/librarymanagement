package project.librarymanagement.librarymanagement.copy;

import project.librarymanagement.librarymanagement.book.BookController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import project.librarymanagement.librarymanagement.hire.Hire;
import project.librarymanagement.librarymanagement.hire.HireRepository;

import java.util.List;

@RestController
public class CopyController {
    @Autowired
    CopyRepository copyRepository;
    @GetMapping("/copy/{id}")
    public Copy getCopyId(@PathVariable("id")int id) {return copyRepository.getOnId(id);}
    @GetMapping("/copy")
    public List<Copy> getCopyAll() {return copyRepository.getAllCopy();}
}
