"use client";

import PageContainer from "@/components/common/PageContainer";
import BookingForm from "@/components/booking/BookingForm";

export default function BookingPage() {
	return (
		<PageContainer>
			<h1 className="text-4xl font-bold mb-8">Train Seat Booking</h1>

			<BookingForm />
		</PageContainer>
	);
}
