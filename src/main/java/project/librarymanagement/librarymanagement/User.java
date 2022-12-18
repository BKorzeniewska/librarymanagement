package project.librarymanagement.librarymanagement;

import java.time.LocalDate;

public class User extends Person {
    private int idUser;
    private String telephone;
    private Category type;
    private boolean status;
    private Person supervisor;
    private LocalDate dateJoin;
    private Location address;
    User()
    {
        super("",LocalDate.now(), Category.Employer, "","",true);
    }


}
