package com.example.intento3.Entity;

import jakarta.persistence.*;

import javax.xml.stream.Location;

@Entity
@Table(name="Departments")
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="departmentId")
    private int departmentId;
    @Column(name="departmentName")
    private String departmentName;
    @Column(name="managerId")
    @ManyToOne
    private Employees employees;
    @Column(name="locationId")
    @ManyToOne
    private Locations locations;
}
