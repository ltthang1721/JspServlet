package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Genre {
    private String genreID;
    private String name;
    private String description;
    public Genre(String genreID, String name, String description){
        this.genreID = genreID;
        this.name = name;
        this.description = description;
    }
}
