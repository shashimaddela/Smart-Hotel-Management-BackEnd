package com.smarthotel.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "rooms")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String roomNumber;

    private String type; // e.g., "Deluxe", "Suite"
    
    @Column(length = 1000)
    private String description;
    
    private double pricePerNight;
    
    private String imageUrl;

    @ElementCollection
    private List<String> amenities;
}
