package project.librarymanagement.librarymanagement.book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private  int idBook;
    private  String title;
    private  String print;
    private  String category;
    private  int year;
    private  int num_rent;
    private  boolean availability;


}
