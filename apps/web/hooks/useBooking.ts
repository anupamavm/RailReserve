"use client";

import { useMutation } from "@tanstack/react-query";

import { createBooking } from "@/services/booking.service";

export function useBooking() {
	return useMutation({
		mutationFn: createBooking,
	});
}
