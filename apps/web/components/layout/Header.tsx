import Link from "next/link";

export default function Header() {
	return (
		<header className="border-b bg-white">
			<div className="mx-auto flex max-w-7xl items-center justify-between px-6 py-5">
				<Link
					href="/"
					className="text-2xl font-bold text-blue-600">
					RailReserve
				</Link>

				<nav className="flex gap-6">
					<Link href="/">Home</Link>

					<Link href="/booking">Booking</Link>
				</nav>
			</div>
		</header>
	);
}
