package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Cart {
    private String cartID;
    private String customerID;
    private Date orderDate;
    private float totalPayment;
    private Boolean status;
    public Cart(String cartID, String customerID, Date orderDate, float totalPayment, Boolean status){
        this.cartID = cartID;
        this.customerID = customerID;
        this.orderDate = orderDate;
        this.totalPayment = totalPayment;
        this.status = status;
    }
}
