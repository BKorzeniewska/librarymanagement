package project.librarymanagement.librarymanagement.hire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class HireRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Hire> getAll(){
        return jdbcTemplate.query("SELECT * FROM hire", BeanPropertyRowMapper.newInstance(Hire.class));
    }
    public Hire getOnId(int id){
        return jdbcTemplate.queryForObject("SELECT * FROM hire WHERE "+" idReservation=?", BeanPropertyRowMapper.newInstance(Hire.class),id);
    }
}
