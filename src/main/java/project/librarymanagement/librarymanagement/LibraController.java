package project.librarymanagement.librarymanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraController {
    @Autowired
    BookRepository bookRepository;
    AuthorRepository authorRepository;
    LibraryRepository libraryRepository;
    HireRepository hireRepository;
    LocationRepository locationRepository;
    ReaderRepository readerRepository;
    UserRepository userRepository;

    @GetMapping("/test")
    public int test()
    {
        return 1;
    }
    @GetMapping("/books")
    public List<Book> getAllBook()
    {
       return bookRepository.getAll();
    }
    // books
    @GetMapping("/books/{id}")
    public Book getBookId(@PathVariable("id")int id)
    {
        return bookRepository.getBookId(id);
    }
    @GetMapping("/books/2016")
    // author
    public Book getBookYear()
    {
        return bookRepository.getBookYear(2016);
    }

    // library
    @GetMapping("/library/")
    public Library getLibraryId() {return libraryRepository.getLibraryId(1);}
    @GetMapping("/library")
    public List<Library> getAll() {return libraryRepository.getAll();}
    // location
    @GetMapping("/location/")
    public Location getLocationId() {return locationRepository.getLocationId(1);}
    @GetMapping("/location")
    public List<Location> getLocationAll() {return locationRepository.getAll();}
    // reader
    @GetMapping("/reader/1")
    public Reader getReaderId() {return readerRepository.getOnId(1);}
    @GetMapping("/reader")
    public List<Reader> getReaderAll() {return readerRepository.getAll();}
    // user
    @GetMapping("/user/1")
    public User getUserId() {return userRepository.getOnId(1);}
    @GetMapping("/user")
    public List<User> getUserAll() {return userRepository.getAll();}
    //hire
    @GetMapping("/hire/1")
    public Hire getHireId() {return hireRepository.getOnId(1);}
    @GetMapping("/hire")
    public List<Hire> getHireAll() {return hireRepository.getAll();}

    @GetMapping("/author/1")
    public Author getAuthorId()
    {
        return authorRepository.getAuthorId(1);
    }

}
