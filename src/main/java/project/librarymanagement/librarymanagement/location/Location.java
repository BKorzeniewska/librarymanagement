package project.librarymanagement.librarymanagement.location;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    private int idLocation;
    private String street;
    private String number;
    private int apartment;
    private String City;
    private String postCode;

    public int getIdLocation() {
        return idLocation;
    }

}
