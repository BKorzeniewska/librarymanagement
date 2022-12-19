package project.librarymanagement.librarymanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController {
    @Autowired
    LibraryRepository libraryRepository;

    @GetMapping("/library/")
    public Library getLibraryId() {return libraryRepository.getLibraryId(1);}
    @GetMapping("/library")
    public List<Library> getAll() {return libraryRepository.getAll();}
}
