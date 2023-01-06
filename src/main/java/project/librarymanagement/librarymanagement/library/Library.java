package project.librarymanagement.librarymanagement.library;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.librarymanagement.librarymanagement.copy.Copy;
import project.librarymanagement.librarymanagement.location.Location;
import project.librarymanagement.librarymanagement.basic.Person;
import project.librarymanagement.librarymanagement.hire.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Library {
    private int idLibrary;
    private Location address;
    private Person owner;
    private String telephone;
    public List<Copy> assortment;
    public List<Hire> hires;

}
