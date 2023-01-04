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
    public Author getAuthorId(int id){
        return jdbcTemplate.queryForObject("SELECT * FROM author WHERE "+" idAuthor=?", BeanPropertyRowMapper.newInstance((Author.class)),id);
    }
    public List<Author> getAll(){
        return jdbcTemplate.query("SELECT * FROM author", BeanPropertyRowMapper.newInstance((Author.class)));
    }

}
