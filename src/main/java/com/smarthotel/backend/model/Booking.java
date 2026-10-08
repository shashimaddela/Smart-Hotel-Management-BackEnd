package com.smarthotel.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "bookings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long hotelId;
    
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    
    private int adults;
    private int children;
    
    private double totalAmount;
    private boolean insuranceIncluded;
    
    private String status; // PENDING, CONFIRMED, CANCELLED
}
