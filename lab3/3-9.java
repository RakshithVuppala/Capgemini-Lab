	public static void duration(LocalDate a) {
		LocalDate today=LocalDate.now();
		Period diff=Period.between(a,today);
		System.out.println("Difference in years: "+diff.getYears()+" Difference in months: "+diff.getMonths()+" Difference in days: "+diff.getDays());
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year YYYY: ");
		int year=scan.nextInt();
		System.out.println("Enter month MM: ");
		int month=scan.nextInt();
		System.out.println("Enter Day DD: ");
		int day=scan.nextInt();
		LocalDate date=LocalDate.of(year, month, day);
		duration(date);
		
	}
