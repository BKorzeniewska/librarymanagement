package project.librarymanagement.librarymanagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Library {
    private int idLibrary;
    private Location address;
    private Person owner;
    private String telephone;
}
