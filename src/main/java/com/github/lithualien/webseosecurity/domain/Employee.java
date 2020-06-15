package com.github.lithualien.webseosecurity.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String email;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column
    private String number;

    @Column
    private boolean employed;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "position_id")
//    private Rank rank;

    public Employee() {
    }

    public Employee(String email, String firstName, String lastName, String number, boolean employed) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.employed = employed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isEmployed() {
        return employed;
    }

    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

//    public Rank getRank() {
//        return rank;
//    }
//
//    public void setRank(Rank rank) {
//        this.rank = rank;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number='" + number + '\'' +
                ", employed=" + employed +
                '}';
    }
}
