import Card from "@/components/common/Card";
import PageContainer from "@/components/common/PageContainer";

export default function BookingPage() {
	return (
		<PageContainer>
			<Card>
				<h1 className="text-3xl font-bold">Train Seat Booking</h1>

				<p className="mt-2 text-gray-600">
					Choose your journey to view available reserved seats.
				</p>
			</Card>
		</PageContainer>
	);
}
