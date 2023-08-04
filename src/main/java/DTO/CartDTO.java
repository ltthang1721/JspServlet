package DTO;

import java.util.Date;

public class CartDTO {
    private String customerID;
    private Date orderDate;
    private float totalPayment;
    private Boolean status;
    public CartDTO (String customerID, Date orderDate, float totalPayment, Boolean status){
        this.customerID = customerID;
        this.orderDate = orderDate;
        this.totalPayment = totalPayment;
        this.status = status;
    }
}
