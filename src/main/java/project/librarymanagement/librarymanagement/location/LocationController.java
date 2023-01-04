package project.librarymanagement.librarymanagement.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {
    @Autowired
    LocationRepository locationRepository;

    @GetMapping("/location/{id}")
    public Location getLocationId(@PathVariable("id")int id) {return locationRepository.getLocationId(id);}
    @GetMapping("/location")
    public List<Location> getLocationAll() {return locationRepository.getAll();}

}
