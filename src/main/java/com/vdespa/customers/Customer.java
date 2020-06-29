package com.vdespa.customers;

public class Customer {
    long id;
    String fistName;
    String lastName;
    String title;
    String gender;

    public Customer(long id, String fistName, String lastName, String title, String gender) {
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.title = title;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
