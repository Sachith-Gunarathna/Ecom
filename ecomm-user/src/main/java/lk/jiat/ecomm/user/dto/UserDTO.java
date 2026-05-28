package lk.jiat.ecomm.user.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {

    private Long id;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String contact;

    public UserDTO() {
    }
    public UserDTO(Long id, String password, String firstName, String lastName, String email, String contact) {
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contact = contact;
    }
    public Long getUser() {
        return id;
    }
    public void setUsername(Long id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    @Override
    public String toString() {
        return "UserDTO" +
                "{" +
                    "id=" + id + "," +
                    " password=" + password + ", " +
                    "firstName=" + firstName + "," +
                    " lastName=" + lastName + ", " +
                    "email=" + email + ", " +
                    "contact=" + contact +
                '}';
    }

}
