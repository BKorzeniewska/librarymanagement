package project.librarymanagement.librarymanagement.reader;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReaderRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Reader> getAll(){
        return jdbcTemplate.query("SELECT * FROM reader", BeanPropertyRowMapper.newInstance(Reader.class));
    }
    public Reader getOnId(int id){
        return jdbcTemplate.queryForObject("SELECT * FROM reader WHERE "+" idReader=?", BeanPropertyRowMapper.newInstance((Reader.class)),id);
    }


}
