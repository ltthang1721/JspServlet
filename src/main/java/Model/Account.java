package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Account {
    private String accountID;
    private String userName;
    private String accountName;
    private String password;
    private String email;
    private int role;
    private String customerID;

    public Account(String accountID, String userName, String accountName, String password, String email, int role, String customerID ){
        this.accountID = accountID;
        this.userName = userName;
        this.accountName = accountName;
        this.password = password;
        this.email = email;
        this.role = role;
        this.customerID = customerID;
    }
}
