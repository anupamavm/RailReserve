package com.railreserve.api.seat;

import com.railreserve.api.booking.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SeatRepository extends JpaRepository<Booking, UUID> {
}
