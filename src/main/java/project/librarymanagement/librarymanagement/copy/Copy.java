package project.librarymanagement.librarymanagement.copy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.librarymanagement.librarymanagement.book.Book;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Copy extends Book {
    private int idCopy;
    private int idBook;
    private int idLibrary;

}
