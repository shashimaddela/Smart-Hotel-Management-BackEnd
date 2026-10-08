package com.smarthotel.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "room_reservations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
    
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    
    private int adults;
    
    private double totalAmount;
    private String paymentStatus; // e.g., "PAID", "PENDING"
}
