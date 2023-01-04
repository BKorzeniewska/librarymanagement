package project.librarymanagement.librarymanagement.reader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class readerController {
    @Autowired
    ReaderRepository readerRepository;
    @GetMapping("/reader/{id}")
    public Reader getReaderId(@PathVariable("id")int id) {return readerRepository.getOnId(id);}
    @GetMapping("/reader")
    public List<Reader> getReaderAll() {return readerRepository.getAll();}

}
