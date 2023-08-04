package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Detail_Ticket {
    private String detailTicketID;
    private String bookID;
    private int quantity;
    private String description;
    public Detail_Ticket(String detailTicketID, String bookID, int quantity, String description){
        this.detailTicketID = detailTicketID;
        this.bookID = bookID;
        this.quantity = quantity;
        this.description = description;
    }
}
