package project.librarymanagement.librarymanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/author/1")
    public Author getAuthorId()
    {
        return authorRepository.getAuthorId(1);
    }

}
