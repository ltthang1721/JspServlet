package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
    private String employeeID;
    private String name;
    private String phoneNumber;
    private String email;
    private String role;

    public Employee(String employeeID, String name, String phoneNumber, String email, String role) {
        this.employeeID = employeeID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.role = role;
    }
}

