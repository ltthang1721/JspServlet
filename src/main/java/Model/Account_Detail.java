package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Account_Detail {
    private String accountID;
    private String userName;
    private String accountName;
    private String password;
    private String email;
    private String images;
    private int role;

    public Account_Detail(String accountID, String userName, String accountName, String password, String email, String images, int role){
        this.accountID = accountID;
        this.userName = userName;
        this.accountName = accountName;
        this.password = password;
        this.email = password;
        this.images = images;
        this.role = role;
    }


}
