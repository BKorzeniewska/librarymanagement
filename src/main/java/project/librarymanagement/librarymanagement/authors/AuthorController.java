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

    @GetMapping("/author/id/{id}")
    public Author getAuthorId(@PathVariable("id")int id)
    {
        return authorRepository.getAuthorId(id);
    }
    @GetMapping("/author/name/{name}")
    public List<Author> getAuthorName(@PathVariable("name")String name)
    {
        return authorRepository.getName(name);
    }
    @GetMapping("/author/surname/{surname}")
    public List<Author> getAuthorId(@PathVariable("surname")String surname)
    {
        return authorRepository.getSurname(surname);
    }

}
