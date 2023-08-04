package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Publisher {
    private String publisherID;
    private String name;
    private String email;
    public Publisher(String publisherID, String name, String email){
        this.publisherID = publisherID;
        this.name = name;
        this.email = email;
    }
}
