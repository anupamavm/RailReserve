CREATE EXTENSION IF NOT EXISTS "uuid-ossp";


CREATE TABLE routes
(

    id         UUID PRIMARY KEY DEFAULT uuid_generate_v4(),

    name       VARCHAR(255) NOT NULL,

    active     BOOLEAN          DEFAULT TRUE,

    created_at TIMESTAMP        DEFAULT CURRENT_TIMESTAMP

);



CREATE TABLE stations
(

    id            UUID PRIMARY KEY DEFAULT uuid_generate_v4(),

    route_id      UUID         NOT NULL,

    name          VARCHAR(100) NOT NULL,

    station_order INTEGER      NOT NULL,

    distance_km   INTEGER      NOT NULL,


    CONSTRAINT fk_station_route
        FOREIGN KEY (route_id)
            REFERENCES routes (id)

);



CREATE TABLE trains
(

    id       UUID PRIMARY KEY DEFAULT uuid_generate_v4(),

    route_id UUID         NOT NULL,

    name     VARCHAR(100) NOT NULL,


    CONSTRAINT fk_train_route
        FOREIGN KEY (route_id)
            REFERENCES routes (id)

);



CREATE TABLE coaches
(

    id           UUID PRIMARY KEY DEFAULT uuid_generate_v4(),

    train_id     UUID        NOT NULL,

    coach_number INTEGER     NOT NULL,


    coach_type   VARCHAR(50) NOT NULL,


    CONSTRAINT fk_coach_train
        FOREIGN KEY (train_id)
            REFERENCES trains (id)

);



CREATE TABLE seats
(

    id          UUID PRIMARY KEY DEFAULT uuid_generate_v4(),

    coach_id    UUID        NOT NULL,


    seat_number VARCHAR(20) NOT NULL,


    CONSTRAINT fk_seat_coach
        FOREIGN KEY (coach_id)
            REFERENCES coaches (id)

);



CREATE INDEX idx_station_order
    ON stations (route_id, station_order);



CREATE INDEX idx_seat_coach
    ON seats (coach_id);