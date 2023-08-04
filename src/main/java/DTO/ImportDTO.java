package DTO;

import java.util.Date;

public class ImportDTO {
    private String providerID;
    private Date importDate;
    private String employeeID;
    public ImportDTO( String providerID, Date importDate, String employeeID){
        this.importDate = importDate;
        this.providerID = providerID;
        this.employeeID = employeeID;
    }
}
