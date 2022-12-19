package project.librarymanagement.librarymanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class readerController {
    @Autowired
    ReaderRepository readerRepository;
    @GetMapping("/reader/1")
    public Reader getReaderId() {return readerRepository.getOnId(1);}
    @GetMapping("/reader")
    public List<Reader> getReaderAll() {return readerRepository.getAll();}

}
