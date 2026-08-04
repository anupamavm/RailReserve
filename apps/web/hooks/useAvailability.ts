"use client";

import { useQuery } from "@tanstack/react-query";

import { searchSeats } from "@/services/booking.service";

export function useAvailability(
	origin?: string,

	destination?: string,
) {
	return useQuery({
		queryKey: ["availability", origin, destination],

		queryFn: () =>
			searchSeats(
				origin!,

				destination!,
			),

		enabled: !!origin && !!destination,
	});
}
