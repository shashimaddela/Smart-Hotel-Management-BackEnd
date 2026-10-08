package com.smarthotel.backend.repository;

import com.smarthotel.backend.model.RoomReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RoomReservationRepository extends JpaRepository<RoomReservation, Long> {
    List<RoomReservation> findByUserId(Long userId);
}
