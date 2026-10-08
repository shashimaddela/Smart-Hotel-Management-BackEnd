package com.smarthotel.backend;

import com.smarthotel.backend.model.Room;
import com.smarthotel.backend.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataSeeder implements CommandLineRunner {

    private final RoomRepository roomRepository;

    @Override
    public void run(String... args) throws Exception {
        if (roomRepository.count() == 0) {
            Room r1 = new Room(null, "101", "Super Deluxe", "Spacious room with king bed and city view.", 5000.0, "https://images.unsplash.com/photo-1590490360182-c33d57733427?auto=format&fit=crop&w=400&q=80", List.of("WiFi", "TV", "Minibar"));
            Room r2 = new Room(null, "102", "Super Deluxe", "Spacious room with king bed and city view.", 5000.0, "https://images.unsplash.com/photo-1590490360182-c33d57733427?auto=format&fit=crop&w=400&q=80", List.of("WiFi", "TV", "Minibar"));
            Room r3 = new Room(null, "201", "Presidential Suite", "Ultimate luxury with a living area and panoramic view.", 15000.0, "https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?auto=format&fit=crop&w=400&q=80", List.of("WiFi", "Mini Bar", "Bathtub", "Balcony"));
            Room r4 = new Room(null, "202", "Presidential Suite", "Ultimate luxury with a living area and panoramic view.", 15000.0, "https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?auto=format&fit=crop&w=400&q=80", List.of("WiFi", "Mini Bar", "Bathtub", "Balcony"));
            
            roomRepository.saveAll(List.of(r1, r2, r3, r4));
            System.out.println("Seeded database with initial rooms.");
        }
    }
}
