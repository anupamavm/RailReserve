"use client";

import { useStations } from "@/hooks/useStations";

import Spinner from "@/components/common/Spinner";

import Card from "@/components/common/Card";

import PageContainer from "@/components/common/PageContainer";

export default function BookingPage() {
	const {
		data,

		isLoading,

		error,
	} = useStations();

	return (
		<PageContainer>
			<Card>
				<h1 className="text-3xl font-bold">Stations</h1>

				{isLoading && <Spinner />}

				{error && <p className="text-red-500">Failed to load stations.</p>}

				<div className="mt-6 space-y-3">
					{data?.map((station) => (
						<div
							key={station.id}
							className="rounded border p-3">
							<strong>{station.stationOrder}</strong>

							{" - "}

							{station.name}
						</div>
					))}
				</div>
			</Card>
		</PageContainer>
	);
}
