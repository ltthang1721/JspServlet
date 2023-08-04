package DTO;

import java.util.Date;

public class SaveHistoryDTO {
    private String auditCode;
    private Date auditDate;
    private String auditItemID;
    private String description;
    private String eventID;
    public SaveHistoryDTO(String auditCode, Date auditDate, String auditItemID, String description, String eventID){
        this.auditCode = auditCode;
        this.auditDate = auditDate;
        this.auditItemID = auditItemID;
        this.description = description;
        this.eventID = eventID;
    }
}
