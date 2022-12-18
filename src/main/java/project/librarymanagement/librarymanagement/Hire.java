package project.librarymanagement.librarymanagement;

import com.fasterxml.jackson.datatype.jsr310.deser.key.LocalDateKeyDeserializer;

import java.time.LocalDate;

public class Hire {
    private int idReservation;
    private Person User;
    private Book book;
    private LocalDate dateHire;
    private LocalDate dateBack;
    private int penalty;


}
