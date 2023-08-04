package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Book {
    private String bookID;
    private String name;
    private int quantity;
    private float price;
    private String images;
    private int priority;
    private String genreID;
    private String publisherID;
    private String authorID;
    private String categoryID;

    public Book() {
    }

    ;

    public Book(String bookID, String name, int quantity, float price, String images, int priority, String genreID, String publisherID, String authorID, String categoryID) {
        this.bookID = bookID;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.images = images;
        this.priority = priority;
        this.genreID = genreID;
        this.publisherID = publisherID;
        this.authorID = authorID;
        this.categoryID = categoryID;
    }
}