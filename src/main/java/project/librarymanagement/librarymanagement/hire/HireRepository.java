package project.librarymanagement.librarymanagement.hire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import project.librarymanagement.librarymanagement.reader.Reader;

import java.util.List;
@Repository
public class HireRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Hire> getAll(){
        List<Hire> list= jdbcTemplate.query("SELECT * FROM hire", BeanPropertyRowMapper.newInstance(Hire.class));
        return list;
    }
    public Hire getOnId(int id){
        Hire hire=jdbcTemplate.queryForObject("SELECT * FROM hire WHERE "+" idReservation=?", BeanPropertyRowMapper.newInstance(Hire.class),id);
        return hire;
    }
}
