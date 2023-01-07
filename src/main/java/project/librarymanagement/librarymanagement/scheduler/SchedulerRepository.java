package project.librarymanagement.librarymanagement.scheduler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SchedulerRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Scheduler> getAll(){
        return jdbcTemplate.query("SELECT * FROM scheduler", BeanPropertyRowMapper.newInstance(Scheduler.class));
    }
    public Scheduler getOnId(int id){
        return jdbcTemplate.queryForObject("SELECT * FROM scheduler WHERE "+" idScheduler=?", BeanPropertyRowMapper.newInstance((Scheduler.class)),id);
    }


}

