package project.librarymanagement.librarymanagement.library;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.librarymanagement.librarymanagement.location.Location;
import project.librarymanagement.librarymanagement.basic.Person;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Library {
    private int idLibrary;
    private Location address;
    private Person owner;
    private String telephone;
    private int num_employees;
    public int  getOwnerId() {
        return owner.getId();
    }
    public int getIdLocaction()
    {
        return address.getIdLocation();
    }
}
