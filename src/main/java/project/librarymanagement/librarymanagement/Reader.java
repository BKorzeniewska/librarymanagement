package project.librarymanagement.librarymanagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Reader extends Person{
    HashMap<LocalDate, Book> wypozyczone;
    ArrayList<Book> zalegajace;
    Reader (String p, LocalDate d, String i, String n, boolean pl, HashMap<LocalDate, Book> lended, ArrayList<Book> book)
    {
        super(p,d,Category.Reader,i,n,pl);
        this.bright = d;
        this.category = Category.Reader;
        this.wypozyczone = lended;
        this.zalegajace = book;
    }



}
