package com.example.intento3.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="jobs")
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="jobId")
    private int jobId;
    @Column(name="jobTitle")
    private String  jobTitle;
    @Column(name="minSalary")
    private String minSalary;
    @Column(name="maxSalary")
    private String maxSalary;
}
