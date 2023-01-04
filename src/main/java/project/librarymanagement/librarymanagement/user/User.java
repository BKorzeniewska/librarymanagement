package project.librarymanagement.librarymanagement.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.librarymanagement.librarymanagement.basic.Category;
import project.librarymanagement.librarymanagement.basic.Person;
import project.librarymanagement.librarymanagement.location.Location;

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
    public int getAddressId()
    {
        return address.getIdLocation();
    }

}
