package com.example.intento3.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="regions")
public class Regions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="locationId")
    private double regionId;
    @Column(name="regionName")
    private String regionName;
}
