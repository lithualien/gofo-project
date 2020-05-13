package com.github.lithualien.webseosecurity.entity;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalTime;

@Entity
@Table
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(name = "hour_rate")
    private double hourRate;

    @Column(name = "overtime_rate")
    private double overtimeRate;

    @Column(name = "weekly_rate")
    private double weeklyRate;

    @Column(name = "monthly_rate")
    private double monthlyRate;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    public Salary() {

    }

    public Salary(double hourRate, double overtimeRate, double weeklyRate, double monthlyRate,
                  Date startDate, Date endDate) {
        this.hourRate = hourRate;
        this.overtimeRate = overtimeRate;
        this.weeklyRate = weeklyRate;
        this.monthlyRate = monthlyRate;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHourRate() {
        return hourRate;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    public double getWeeklyRate() {
        return weeklyRate;
    }

    public void setWeeklyRate(double weeklyRate) {
        this.weeklyRate = weeklyRate;
    }

    public double getMonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(double monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", hourRate=" + hourRate +
                ", overtimeRate=" + overtimeRate +
                ", weeklyRate=" + weeklyRate +
                ", monthlyRate=" + monthlyRate +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
