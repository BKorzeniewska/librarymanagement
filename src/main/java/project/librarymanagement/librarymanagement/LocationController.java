package project.librarymanagement.librarymanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {
    @Autowired
    LocationRepository locationRepository;

    @GetMapping("/location/1")
    public Location getLocationId() {return locationRepository.getLocationId(1);}
    @GetMapping("/location")
    public List<Location> getLocationAll() {return locationRepository.getAll();}

}
