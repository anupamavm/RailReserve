import api from "./api";

import { AvailableSeat, Booking, BookingRequest } from "@/types/booking";

export async function searchSeats(
	origin: string,

	destination: string,
): Promise<AvailableSeat[]> {
	const response = await api.get("/bookings/availability", {
		params: {
			origin,

			destination,
		},
	});

	return response.data;
}

export async function createBooking(request: BookingRequest): Promise<Booking> {
	const response = await api.post(
		"/bookings",

		request,
	);

	return response.data;
}
