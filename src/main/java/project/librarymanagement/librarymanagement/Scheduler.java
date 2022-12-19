package project.librarymanagement.librarymanagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Scheduler {
    private int idScheduler;
    private String workMode;
    private int numberFreeDays;

}
