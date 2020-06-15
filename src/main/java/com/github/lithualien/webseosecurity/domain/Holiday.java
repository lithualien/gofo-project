package com.github.lithualien.webseosecurity.entity;

import com.github.lithualien.webseosecurity.entity.superclass.Temp;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
public class Holiday extends Temp {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Holiday() { }

    public Holiday(Date startDate, Date endDate) {
        super(startDate, endDate);
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
