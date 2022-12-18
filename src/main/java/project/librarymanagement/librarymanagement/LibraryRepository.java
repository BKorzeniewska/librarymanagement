package project.librarymanagement.librarymanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LibraryRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Library> getAll(){
        return jdbcTemplate.query("SELECT * FROM library", BeanPropertyRowMapper.newInstance(Library.class));
    }
    public Library getLibraryId(int id){
        return jdbcTemplate.queryForObject("SELECT * FROM library WHERE "+" idLibrary=?", BeanPropertyRowMapper.newInstance((Library.class)),id);
    }
}
