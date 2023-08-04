package DTO;

public class BookDTO {
    public String name;
    public int quantity;
    public float price;
    public String images;
    public int priority;
    public String genreID;
    public String publisherID;
    public String authorID;
    public String categoryID;

    public BookDTO(String name, String genreID, String publisherID, String authorID, int quantity, float price, String images, int priority, String categoryID) {
        this.name = name;
        this.genreID = genreID;
        this.publisherID = publisherID;
        this.authorID = authorID;
        this.quantity = quantity;
        this.price = price;
        this.images = images;
        this.priority = priority;
        this.categoryID = categoryID;
    }
}
