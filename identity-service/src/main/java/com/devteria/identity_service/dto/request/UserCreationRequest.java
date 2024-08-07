package com.devteria.identity_service.dto.request;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class UserCreationRequest {
    @Size(min = 4 ,message = "USERNAME_INVALID") // Truyen theo key cua ErrorCode
    private String username;
    // Khai bao validation cho password
    @Size(min = 8 ,message = "INVALID_PASSWORD")
    private String password;
    private String firstname;
    private String lastname;
    private LocalDate dob;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "UserCreationRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dob=" + dob +
                '}';
    }
}
