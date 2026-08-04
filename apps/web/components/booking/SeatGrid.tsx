"use client";

import Card from "@/components/common/Card";

import { AvailableSeat } from "@/types/booking";

interface Props {
	seats: AvailableSeat[];

	origin: string;

	destination: string;
}

export default function SeatGrid({ seats }: Props) {
	return (
		<Card>
			<h2 className="text-2xl font-semibold">Available Seats</h2>

			<div className="mt-6">
				{seats.length === 0 && <p>No seats available.</p>}

				{seats.map((seat) => (
					<div
						key={seat.seatId}
						className="border rounded-lg p-4 mb-3">
						<div>
							<strong>{seat.seatNumber}</strong>
						</div>

						<div>Coach {seat.coachNumber}</div>

						<div>{seat.coachType}</div>
					</div>
				))}
			</div>
		</Card>
	);
}
