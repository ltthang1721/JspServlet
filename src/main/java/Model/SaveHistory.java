package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class SaveHistory {
    private int id;
    private String auditCode;
    private Date auditDate;
    private String auditItemID;
    private String description;
    private String eventID;
    public SaveHistory(int id, String auditCode, Date auditDate, String auditItemID, String description, String eventID){
        this.id = id;
        this.auditCode = auditCode;
        this.auditDate = auditDate;
        this.auditItemID = auditItemID;
        this.description = description;
        this.eventID = eventID;
    }
}
