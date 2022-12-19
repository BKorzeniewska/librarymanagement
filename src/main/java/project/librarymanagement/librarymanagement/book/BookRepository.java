package project.librarymanagement.librarymanagement.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Book> getAll(){
        return jdbcTemplate.query("SELECT * FROM book", BeanPropertyRowMapper.newInstance((Book.class)));
    }
    public Book getBookYear(int year){
        return jdbcTemplate.queryForObject("SELECT * FROM book WHERE "+" year=?", BeanPropertyRowMapper.newInstance((Book.class)),year);
    }
    public Book getBookPrint(String print){
        return jdbcTemplate.queryForObject("SELECT * FROM book WHERE "+" print=?", BeanPropertyRowMapper.newInstance((Book.class)),print);
    }
    public Book getBookTitle(String title){
        return jdbcTemplate.queryForObject("SELECT * FROM book WHERE "+" title=?", BeanPropertyRowMapper.newInstance((Book.class)),title);
    }
    public Book getBookId(int id){
        return jdbcTemplate.queryForObject("SELECT * FROM book WHERE "+" idBook=?", BeanPropertyRowMapper.newInstance((Book.class)),id);
    }
}
