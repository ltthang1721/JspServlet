package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cart_Detail {
    private String cartID;
    private String bookID;
    private int quantity;
    private float price;
    public Cart_Detail(String cartID, String bookID, int quantity, float price){
        this.cartID = cartID;
        this.bookID = bookID;
        this.quantity = quantity;
        this.price = price;
    }
}
