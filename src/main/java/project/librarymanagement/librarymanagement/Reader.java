package project.librarymanagement.librarymanagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Reader extends Person{
    HashMap<LocalDate, Book> wypozyczone;
    ArrayList<Book> zalegajace;
}
