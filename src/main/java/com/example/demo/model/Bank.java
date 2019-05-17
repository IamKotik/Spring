package com.example.demo.model;

public class Bank {
    public int id;
    public String person;
    public double dolg;
    public boolean platit;
    public String phone;

    public Bank(){};

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public double getDolg() {
        return dolg;
    }

    public void setDolg(double dolg) {
        this.dolg = dolg;
    }

    public boolean getPlatit() {
        return platit;
    }

    public void setPlatit(boolean platit) {
        this.platit = platit;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
