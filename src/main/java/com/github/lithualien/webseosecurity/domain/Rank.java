package com.github.lithualien.webseosecurity.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "company_rank")
public class Rank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String position;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_rank_id")
    private List<Salary> salaries;

    public Rank() {
    }

    public Rank(String position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<Salary> getSalaries() {
        if(salaries == null) {
            salaries = new ArrayList<>();
        }
        return salaries;
    }

    public void setSalaries(List<Salary> salaries) {
        this.salaries = salaries;
    }

    public void addSalary(Salary salary) {
        getSalaries().add(salary);
    }

    @Override
    public String toString() {
        return "Rank{" +
                "id=" + id +
                ", name='" + position + '\'' +
                '}';
    }
}
