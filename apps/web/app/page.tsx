import Link from "next/link";

import Button from "@/components/common/Button";
import Card from "@/components/common/Card";
import PageContainer from "@/components/common/PageContainer";

export default function Home() {
	return (
		<PageContainer>
			<div className="flex justify-center mt-24">
				<Card>
					<h1 className="text-4xl font-bold">RailReserve</h1>

					<p className="mt-4 text-gray-600">
						Segment-Based Railway Seat Reservation System
					</p>

					<div className="mt-8">
						<Link href="/booking">
							<Button>Book a Seat</Button>
						</Link>
					</div>
				</Card>
			</div>
		</PageContainer>
	);
}
