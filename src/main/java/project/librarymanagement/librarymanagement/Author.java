package project.librarymanagement.librarymanagement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private int idAuthor;
    private String name;
    private String surname;
}
