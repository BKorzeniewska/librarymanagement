package project.librarymanagement.librarymanagement.reader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.librarymanagement.librarymanagement.authors.Author;

import java.util.List;

@RestController
public class readerController {
    @Autowired
    ReaderRepository readerRepository;
    @GetMapping("/reader/{id}")
    public Reader getReaderId(@PathVariable("id")int id) {return readerRepository.getOnId(id);}
    @GetMapping("/reader")
    public List<Reader> getReaderAll() {return readerRepository.getAll();}
    @PostMapping("/reader/insert/")
    public int addAuthor(@RequestBody List<Reader> readers){
        readerRepository.save(readers);
        return 1;
    }

}
