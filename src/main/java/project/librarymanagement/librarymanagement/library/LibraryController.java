package project.librarymanagement.librarymanagement.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController {
    @Autowired
    LibraryRepository libraryRepository;

    @GetMapping("/library/{id}")
    public Library getLibraryId(@PathVariable("id")int id) {return libraryRepository.getLibraryId(id);}
    @GetMapping("/library")
    public List<Library> getAll() {return libraryRepository.getAll();}
}
