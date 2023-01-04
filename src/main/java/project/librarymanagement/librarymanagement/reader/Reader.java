package project.librarymanagement.librarymanagement.reader;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.librarymanagement.librarymanagement.basic.Person;
import project.librarymanagement.librarymanagement.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Reader extends Person {
    HashMap<LocalDate, Book> wypozyczone;
    ArrayList<Book> zalegajace;
    boolean status;
    public boolean getStatus()
    {
        return status;
    }
}
