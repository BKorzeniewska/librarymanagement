package project.librarymanagement.librarymanagement.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.librarymanagement.librarymanagement.authors.Author;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class LibraryController {
    @Autowired
    LibraryRepository libraryRepository;

    @GetMapping("/library/{id}")
    public Library getLibraryId(@PathVariable("id")int id) {return libraryRepository.getLibraryId(id);}
    @GetMapping("/library")
    public List<Library> getAll() {return libraryRepository.getAll();}
    @PostMapping("/library/insert/")
    public int addLibraries(@RequestBody List<Library> libraries){
        libraryRepository.save(libraries);
        return 1;
    }
}
