package com.qualityhouse.course.automation.keyworddriventesting.support;

public class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String phone;
    private String address;

    public User(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public User(String username, String password, String name, String email, String phone, String address) {
        setUsername(username);
        setPassword(password);
        setName(name);
        setEmail(email);
        setPhone(phone);
        setAddress(address);
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
