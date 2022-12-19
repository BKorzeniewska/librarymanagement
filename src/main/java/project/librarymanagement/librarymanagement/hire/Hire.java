package project.librarymanagement.librarymanagement.hire;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.librarymanagement.librarymanagement.basic.Person;
import project.librarymanagement.librarymanagement.book.Book;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hire {
    private int idReservation;
    private Person User;
    private Book book;
    private LocalDate dateHire;
    private LocalDate dateBack;
    private int penalty;


}
