"use client";

import { useMemo, useState } from "react";

import Card from "@/components/common/Card";
import Button from "@/components/common/Button";
import Select from "@/components/common/Select";
import Spinner from "@/components/common/Spinner";

import { useStations } from "@/hooks/useStations";
import { useAvailability } from "@/hooks/useAvailability";

import SeatGrid from "./SeatGrid";

export default function BookingForm() {
	const { data: stations, isLoading } = useStations();

	const [origin, setOrigin] = useState("");

	const [destination, setDestination] = useState("");

	const [searchClicked, setSearchClicked] = useState(false);

	const stationOptions = useMemo(() => {
		if (!stations) return [];

		return stations.map((station) => ({
			value: station.id,
			label: station.name,
		}));
	}, [stations]);

	const { data: seats, isLoading: loadingSeats } = useAvailability(
		searchClicked ? origin : undefined,
		searchClicked ? destination : undefined,
	);

	if (isLoading) {
		return <Spinner />;
	}

	const validateJourney = () => {
		if (!stations) return false;

		const originStation = stations.find((s) => s.id === origin);

		const destinationStation = stations.find((s) => s.id === destination);

		if (!originStation || !destinationStation) return false;

		return destinationStation.stationOrder > originStation.stationOrder;
	};

	const handleSearch = () => {
		if (!validateJourney()) {
			alert("Destination must come after origin.");

			return;
		}

		setSearchClicked(true);
	};

	return (
		<>
			<Card>
				<div className="grid grid-cols-1 md:grid-cols-2 gap-6">
					<Select
						label="Origin"
						value={origin}
						options={stationOptions}
						onChange={(value) => {
							setOrigin(value);

							setSearchClicked(false);
						}}
					/>

					<Select
						label="Destination"
						value={destination}
						options={stationOptions}
						onChange={(value) => {
							setDestination(value);

							setSearchClicked(false);
						}}
					/>
				</div>

				<div className="mt-8">
					<Button onClick={handleSearch}>Search Available Seats</Button>
				</div>
			</Card>

			{loadingSeats && <Spinner />}

			{searchClicked && seats && (
				<div className="mt-8">
					<SeatGrid
						seats={seats}
						origin={origin}
						destination={destination}
					/>
				</div>
			)}
		</>
	);
}
