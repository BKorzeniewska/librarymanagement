package project.librarymanagement.librarymanagement.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.librarymanagement.librarymanagement.authors.Author;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import project.librarymanagement.librarymanagement.authors.Author;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookRepository bookRepository;
    //GET
    @GetMapping("/books")
    public List<Book> getAllBook()
    {
        return bookRepository.getAll();
    }
    // books
    @GetMapping("/books/id/{id}")
    public Book getBookId(@PathVariable("id")int id)
    {
        return bookRepository.getBookId(id);
    }
    @GetMapping("/books/title/{title}")
    public List<Book> getBookTitle(@PathVariable("title")String title)
    {
        return bookRepository.getBookTitle(title);
    }
    @GetMapping("/books/print/{print}")
    public List<Book> getAuthorId(@PathVariable("print")String print)
    {
        return bookRepository.getBookPrint(print);
    }
    @GetMapping("/books/year/{year}")
    // author
    public Book getBookYear(@PathVariable("year")int year)
    {
        return bookRepository.getBookYear(year);
    }
    @PostMapping("/books/insert/")
    public int addBooks(@RequestBody List<Book> books){
        bookRepository.save(books);
        return 1;
    }

}
