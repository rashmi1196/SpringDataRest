package com.spring.data.rest.SpringDataRest.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    private String Name;

    private  int Age;

    private String Nationality;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date DOB;

    private int Designation;

    public Player() {
    }

    public Player(Integer ID,String Name, int Age, String Nationality, Date DOB, int Designation) {
        this.ID = ID;
        this.Name = Name;
        this.Age = Age;
        this.Nationality = Nationality;
        this.DOB = DOB;
        this.Designation = Designation;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getNationality() {
        return Nationality;
    }

    public Date getDOB() {
        return DOB;
    }

    public int getDesignation() {
        return Designation;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public void setDesignation(int Designation) {
        this.Designation = Designation;
    }


}
