package com.mamun.jpa.model;

import jakarta.persistence.*;

@Entity
public class Laptop {

    @Id
    private int lId;
    private String laptopName;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Laptop() {
    }

    public Laptop(int lId, String laptopName) {
        this.lId = lId;
        this.laptopName = laptopName;
    }

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }



    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lId=" + lId +
                ", laptopName='" + laptopName + '\'' +
                '}';
    }
}
