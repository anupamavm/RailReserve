export interface AvailableSeat {
	seatId: string;

	seatNumber: string;

	coachNumber: number;

	coachType: string;
}

export interface BookingRequest {
	seatId: string;

	originStationId: string;

	destinationStationId: string;
}

export interface Booking {
	id: string;

	fare: number;

	status: string;
}
