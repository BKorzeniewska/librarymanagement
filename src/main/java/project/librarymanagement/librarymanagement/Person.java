package project.librarymanagement.librarymanagement;

import java.time.LocalDate;

public class Person {
    int id;
    String pesel;
    LocalDate bright;
    Category category;
    String name;
    String surname;
    boolean gender;
    Person ( String p, LocalDate d, Category k, String i, String n, boolean pl) {
        this.name = i;
        this.surname = n;
        this.pesel = p;
        this.gender = pl;
        this.bright = d;
        this.category = k;
    }

}

