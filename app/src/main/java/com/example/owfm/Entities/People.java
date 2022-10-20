package com.example.owfm.Entities;

public class People {

    private Long ID;
    private String fullName;
    private String lastName;
    private String firstName;
    private String personId;
    private String company;
    private String sync;

    public Long getID() {
        return ID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPersonId() {
        return personId;
    }

    public String getCompany() {
        return company;
    }

    public String getSync() {
        return sync;
    }

    public void setID(Long iD) {
        ID = iD;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSync(String sync) {
        this.sync = sync;
    }
}
