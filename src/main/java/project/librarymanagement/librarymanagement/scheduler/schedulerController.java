package project.librarymanagement.librarymanagement.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class schedulerController {
    @Autowired
            SchedulerRepository SchedulerRepository;
    @GetMapping("/scheduler/{id}")
    public Scheduler getSchedulerId(@PathVariable("id")int id) {return SchedulerRepository.getOnId(id);}
    @GetMapping("/scheduler")
    public List<Scheduler> getSchedulerAll() {return SchedulerRepository.getAll();}

}
