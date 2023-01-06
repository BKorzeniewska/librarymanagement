package project.librarymanagement.librarymanagement.copy;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import project.librarymanagement.librarymanagement.book.*;

import java.util.List;
@Repository
public class CopyRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Copy> getAllCopy(){
        return jdbcTemplate.query("SELECT * FROM copy JOIN book ON copy.idBook = book.idBook", BeanPropertyRowMapper.newInstance(Copy.class));
    }
    public Copy getOnId(int id){
        return jdbcTemplate.queryForObject("SELECT * FROM copy JOIN book ON copy.idBook = book.idBook WHERE "+" idCopy=?", BeanPropertyRowMapper.newInstance(Copy.class),id);
    }
}
