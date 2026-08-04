import "./globals.css";

import Providers from "@/components/common/Providers";
import Header from "@/components/layout/Header";
import Footer from "@/components/layout/Footer";

export const metadata = {
	title: "RailReserve",
	description: "Segment Based Railway Reservation",
};

export default function RootLayout({
	children,
}: {
	children: React.ReactNode;
}) {
	return (
		<html lang="en">
			<body>
				<Providers>
					<Header />

					{children}

					<Footer />
				</Providers>
			</body>
		</html>
	);
}
