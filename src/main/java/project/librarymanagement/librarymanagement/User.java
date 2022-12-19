package project.librarymanagement.librarymanagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends Person {
    private int idUser;
    private String telephone;
    private Category type;
    private boolean status;
    private Person supervisor;
    private LocalDate dateJoin;
    private Location address;

}
