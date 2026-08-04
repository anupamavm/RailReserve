interface Option {
	value: string;
	label: string;
}

interface SelectProps {
	label: string;
	value: string;
	options: Option[];
	onChange: (value: string) => void;
}

export default function Select({
	label,
	value,
	options,
	onChange,
}: SelectProps) {
	return (
		<div className="space-y-2">
			<label className="font-medium">{label}</label>

			<select
				value={value}
				onChange={(e) => onChange(e.target.value)}
				className="w-full rounded-lg border border-gray-300 p-3">
				<option value="">Select...</option>

				{options.map((option) => (
					<option
						key={option.value}
						value={option.value}>
						{option.label}
					</option>
				))}
			</select>
		</div>
	);
}
