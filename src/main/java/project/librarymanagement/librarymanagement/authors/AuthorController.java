package project.librarymanagement.librarymanagement.authors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    AuthorRepository authorRepository;

    @GetMapping("/authors")
    public List<Author> getAllAuthor()
    {
        return authorRepository.getAll();
    }

    @GetMapping("/author/{id}")
    public Author getAuthorId(@PathVariable("id")int id)
    {
        return authorRepository.getAuthorId(id);
    }

}
