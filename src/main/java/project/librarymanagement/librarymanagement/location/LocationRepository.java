package project.librarymanagement.librarymanagement.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import project.librarymanagement.librarymanagement.library.Library;

import java.util.List;

@Repository
public class LocationRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Location> getAll(){
        return jdbcTemplate.query("SELECT * FROM location", BeanPropertyRowMapper.newInstance(Location.class));
    }
    public Location getLocationId(int id){
        return jdbcTemplate.queryForObject("SELECT * FROM location WHERE "+" idLocation=?", BeanPropertyRowMapper.newInstance((Location.class)),id);
    }

    //Insert

    public int save(List<Location> locations) {
        locations.forEach(location->jdbcTemplate.update("Insert into location(idLocation,street, number, apartment, city, postCode) VALUES (?",location.getIdLocation(),location.getStreet(),location.getNumber(),location.getApartment(),location.getCity(),location.getPostCode()));
        return 1;
    }
}
