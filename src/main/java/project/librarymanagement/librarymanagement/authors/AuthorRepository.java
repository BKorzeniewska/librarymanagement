package project.librarymanagement.librarymanagement.authors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthorRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    ////////////////////
    /////GET ///////////
    public Author getAuthorId(int id){
        return jdbcTemplate.queryForObject("SELECT * FROM author WHERE "+" idAuthor=?", BeanPropertyRowMapper.newInstance((Author.class)),id);
    }
    public List<Author> getAll(){
        return jdbcTemplate.query("SELECT * FROM author", BeanPropertyRowMapper.newInstance((Author.class)));
    }

    public List<Author> getSurname(String surname){
        return jdbcTemplate.query("SELECT * FROM author WHERE +"+"surname=?", BeanPropertyRowMapper.newInstance((Author.class)),surname);
    }
    public List<Author> getName(String name){
        return jdbcTemplate.query("SELECT * FROM author WHERE +"+"name=?", BeanPropertyRowMapper.newInstance((Author.class)),name);
    }




    ////////////////////
    /////SET///////////

    public int save(List<Author> authors) {
        authors.forEach(author->jdbcTemplate.update("Insert into authors(idAuthor,name, surname) VALUES (?",author.getIdAuthor(),author.getName(),author.getSurname()));
        return 1;
    }
}
