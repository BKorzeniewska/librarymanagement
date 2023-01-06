package project.librarymanagement.librarymanagement.hire;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.librarymanagement.librarymanagement.basic.Person;
import project.librarymanagement.librarymanagement.book.Book;
import project.librarymanagement.librarymanagement.copy.Copy;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hire {
    private int idReservation;
    private int idCopy;
    private LocalDate dateHire;
    private LocalDate dateBack;
    private int idReader;
    private int penalty;
    //private Person User;
    //private Copy copy;



}
