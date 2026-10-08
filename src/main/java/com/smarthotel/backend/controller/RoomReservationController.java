package com.smarthotel.backend.controller;

import com.smarthotel.backend.model.RoomReservation;
import com.smarthotel.backend.repository.RoomReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class RoomReservationController {

    private final RoomReservationRepository reservationRepository;

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<RoomReservation>> getUserReservations(@PathVariable Long userId) {
        return ResponseEntity.ok(reservationRepository.findByUserId(userId));
    }

    @PostMapping
    public ResponseEntity<RoomReservation> createReservation(@RequestBody RoomReservation reservation) {
        reservation.setPaymentStatus("PAID");
        return ResponseEntity.ok(reservationRepository.save(reservation));
    }
}
