package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Getter
@Setter
@ToString
public class Import {
    private String importID;
    private String providerID;
    private Date importDate;
    private String employeeID;
    public Import(String importID, String providerID, Date importDate, String employeeID){
        this.importID = importID;
        this.importDate = importDate;
        this.providerID = providerID;
        this.employeeID = employeeID;
    }
}
