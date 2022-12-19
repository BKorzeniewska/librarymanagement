package project.librarymanagement.librarymanagement.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookRepository bookRepository;

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

}
