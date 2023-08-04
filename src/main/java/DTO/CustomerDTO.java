package DTO;

public class CustomerDTO {
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    public CustomerDTO(String name, String phoneNumber, String email, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }
}
