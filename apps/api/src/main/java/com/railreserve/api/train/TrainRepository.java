package com.railreserve.api.train;

import com.railreserve.api.booking.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrainRepository extends JpaRepository<Booking, UUID> {
}
