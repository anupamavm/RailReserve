"use client";

import { useQuery } from "@tanstack/react-query";

import { getStations } from "@/services/station.service";

export function useStations() {
	return useQuery({
		queryKey: ["stations"],

		queryFn: getStations,
	});
}
