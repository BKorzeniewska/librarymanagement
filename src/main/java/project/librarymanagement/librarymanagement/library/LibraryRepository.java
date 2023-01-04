package project.librarymanagement.librarymanagement.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import project.librarymanagement.librarymanagement.book.Book;
import project.librarymanagement.librarymanagement.library.Library;

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

    //Insert
    public int save(List<Library> libraries) {
        libraries.forEach(library->jdbcTemplate.update("Insert into library(idLibrary,idLocation, idOwner, telephone, num_employees) VALUES (?",library.getIdLibrary(),library.getIdLocaction(),library.getOwnerId(),library.getTelephone(),library.getNum_employees()));
        return 1;
    }
}
