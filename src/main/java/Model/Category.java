package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Category {
    private String categoryID;
    private String name;
    private String description;
    public Category(String categoryID, String name, String description){
        this.categoryID = categoryID;
        this.name = name;
        this.description = description;
    }
}
