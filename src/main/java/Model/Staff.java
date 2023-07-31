package Model;

public class Staff {
    private String staffId;
    private String name;
    private String phoneNumber;
    private String email;
    private String role;

    public Staff() {
    }
    public Staff(String staffId, String name, String phoneNumber, String email, String role) {
        this.staffId = staffId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.role = role;
    }


    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

