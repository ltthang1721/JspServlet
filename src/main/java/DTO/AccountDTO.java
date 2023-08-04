package DTO;

public class AccountDTO {
    private String userName;
    private String accountName;
    private String password;
    private String email;
    private int role;
    private String customerID;
    public AccountDTO( String userName, String accountName, String password, String email, int role, String customerID ){
        this.userName = userName;
        this.accountName = accountName;
        this.password = password;
        this.email = email;
        this.role = role;
        this.customerID = customerID;
    }
}
