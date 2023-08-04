package DTO;

public class EmployeeDTO {
    private String name;
    private String phoneNumber;
    private String email;
    private String role;
    public EmployeeDTO( String name, String phoneNumber, String email, String role) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.role = role;
    }
}
