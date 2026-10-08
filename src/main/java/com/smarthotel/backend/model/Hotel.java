package com.smarthotel.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "hotels")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    
    @Column(length = 1000)
    private String description;
    
    private double rating;
    private int reviewCount;
    private double pricePerNight;
    
    private String imageUrl;

    @ElementCollection
    private List<String> amenities;
}
