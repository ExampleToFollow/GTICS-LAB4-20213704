package com.example.intento3.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="jobHistory")
public class JobHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="jobHistoryId")
    private int jobHistoryId;
    @Column(name="employeeId")
    private String  employeeId;
    @Column(name="startDate")
    private Date startDate;
    @Column(name="endDate")
    private Date endDate;
    @Column(name="jobId")
    private String jobId;
    @Column(name="departmentId")
    private String departmentId;

}
