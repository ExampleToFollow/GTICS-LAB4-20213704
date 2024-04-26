package com.example.intento3.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employeeId")
    private int idEmployees;
    @Column(name="firstName")
    private String  firstName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="phoneNumber")
    private String phoneNumber;
    @Column(name="hireDate")
    private Date hireDate;
    @Column(name="jobId")
    @ManyToOne
    private Jobs jobs;
    @Column(name="salary")
    private Double salary;
    @Column(name="commissionPct")
    private Double commissionPct;
    @Column(name="managerId")
    @ManyToOne
    private Employees manager;
    @Column(name="departmenId")
    @ManyToOne
    private Departments department;



}
