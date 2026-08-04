import clsx from "clsx";

interface ButtonProps extends React.ButtonHTMLAttributes<HTMLButtonElement> {
	loading?: boolean;
}

export default function Button({
	loading,
	className,
	children,
	...props
}: ButtonProps) {
	return (
		<button
			{...props}
			disabled={loading || props.disabled}
			className={clsx(
				"w-full rounded-lg bg-blue-600 px-4 py-3 text-white font-semibold transition",
				"hover:bg-blue-700",
				"disabled:cursor-not-allowed disabled:opacity-50",
				className,
			)}>
			{loading ? "Loading..." : children}
		</button>
	);
}
