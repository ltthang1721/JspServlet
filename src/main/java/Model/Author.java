package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Author {
    private String authorID;
    private String name;
    private String email;
    private String phoneNumber;
    public Author(String authorID, String name, String email, String phoneNumber){
        this.authorID = authorID;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
