package project.librarymanagement.librarymanagement.authors;
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
