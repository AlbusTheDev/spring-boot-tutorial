package com.qusaidev.springboot.springmvc.model;

import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favLang;
    private List<String> favSystems;

    public Student() {
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavLang() {
        return favLang;
    }

    public void setFavLang(String favLang) {
        this.favLang = favLang;
    }

    public List<String> getFavSystems() {
        return favSystems;
    }

    public void setFavSystems(List<String> favSystems) {
        this.favSystems = favSystems;
    }
}
