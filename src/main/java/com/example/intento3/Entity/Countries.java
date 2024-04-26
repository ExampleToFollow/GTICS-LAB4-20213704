package com.example.intento3.Entity;

import jakarta.persistence.*;

@Entity
@Table(name= "countries")
public class Countries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="countryId")
    private String countryId;
    @Column(name="countryName")
    private String countryName;
    @Column(name="countries")
    @ManyToOne
    @JoinColumn(name="regionId")
    private  Regions regions;

}
