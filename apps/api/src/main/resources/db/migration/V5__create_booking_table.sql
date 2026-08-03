CREATE TABLE bookings
(

    id                     UUID PRIMARY KEY DEFAULT uuid_generate_v4(),


    seat_id                UUID NOT NULL,


    origin_station_id      UUID NOT NULL,


    destination_station_id UUID NOT NULL,


    status                 VARCHAR(50),


    fare                   NUMERIC(10, 2),


    created_at             TIMESTAMP        DEFAULT CURRENT_TIMESTAMP,


    CONSTRAINT fk_booking_seat
        FOREIGN KEY (seat_id)
            REFERENCES seats (id),


    CONSTRAINT fk_booking_origin
        FOREIGN KEY (origin_station_id)
            REFERENCES stations (id),


    CONSTRAINT fk_booking_destination
        FOREIGN KEY (destination_station_id)
            REFERENCES stations (id)

);