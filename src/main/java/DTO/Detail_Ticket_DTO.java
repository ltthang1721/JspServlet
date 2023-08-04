package DTO;

public class Detail_Ticket_DTO {
    private String bookID;
    private int quantity;
    private String description;
    public Detail_Ticket_DTO( String bookID, int quantity, String description){
        this.bookID = bookID;
        this.quantity = quantity;
        this.description = description;
    }
}
