import api from "./api";

import { Station } from "@/types/station";

export async function getStations(): Promise<Station[]> {
	const response = await api.get("/stations");

	return response.data;
}
