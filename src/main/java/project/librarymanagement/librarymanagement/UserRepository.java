package project.librarymanagement.librarymanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<User> getAll(){
        return jdbcTemplate.query("SELECT * FROM user", BeanPropertyRowMapper.newInstance(User.class));
    }
    public User getOnId(int id){
        return jdbcTemplate.queryForObject("SELECT * FROM location WHERE "+" idUser=?", BeanPropertyRowMapper.newInstance(User.class),id);
    }
}
