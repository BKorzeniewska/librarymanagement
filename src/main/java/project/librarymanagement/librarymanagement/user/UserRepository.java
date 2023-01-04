package project.librarymanagement.librarymanagement.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import project.librarymanagement.librarymanagement.reader.Reader;

import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<User> getAll(){
        return jdbcTemplate.query("SELECT * FROM user", BeanPropertyRowMapper.newInstance(User.class));
    }
    public User getOnId(int id){
        return jdbcTemplate.queryForObject("SELECT * FROM user WHERE "+" idUser=?", BeanPropertyRowMapper.newInstance(User.class),id);
    }
    //Insert
    public int save(List<User> users) {
        users.forEach(user->jdbcTemplate.update("Insert into user(idUser,idLocation,name, surname, gender, telephone, type, status, idSupervisor dateJoin) VALUES (?",user.getId(),user.getAddressId(),user.getName(),user.getSurname(),user.isGender(),user.getTelephone(),user.getType(),user.getSupervisor().getId(),user.getDateJoin()));
        return 1;
    }
}
