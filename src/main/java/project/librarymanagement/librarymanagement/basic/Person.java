package project.librarymanagement.librarymanagement.basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    int id;
    String pesel;
    LocalDate bright;
    Category category;
    String name;
    String surname;
    boolean gender;
}

