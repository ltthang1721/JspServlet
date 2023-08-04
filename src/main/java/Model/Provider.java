package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Provider {
    private String providerID;
    private String name;
    private String address;
    private String phoneNumber;
    public Provider(String providerID, String name, String address, String phoneNumber){
        this.providerID = providerID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}
