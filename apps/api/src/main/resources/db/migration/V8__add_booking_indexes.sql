CREATE INDEX idx_booking_seat_segment
    ON bookings
        (
         seat_id,
         start_order,
         end_order
            );