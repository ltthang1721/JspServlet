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

    public BookDTO(String name, String matl, String manxb, String matg, int sl, float giatien, String hinh, int uutien, String madm) {
        this.name = name;
        this.genreID = matl;
        this.publisherID = manxb;
        this.authorID = matg;
        this.quantity = sl;
        this.price = giatien;
        this.images = hinh;
        this.priority = uutien;
        this.categoryID = madm;
    }
}
