package com.example.intento3.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="locations")
public class Locations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="locationId")
    private int locationId;
    @Column(name="streetAddress")
    private String streetAddress;
    @Column(name="postalCode")
    private String postalCode;
    @Column(name="city")
    private String city;
    @Column(name="stateProvince")
    private String stateProvince;
    @Column(name ="countryId")
    @ManyToOne
    private Countries countries;
}
