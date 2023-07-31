package Model;

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

    public Book(){};
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
    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getGenreID() {
        return genreID;
    }

    public void setGenreID(String genreID) {
        this.genreID = genreID;
    }

    public String getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(String publisherID) {
        this.publisherID = publisherID;
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }
}
