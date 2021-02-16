	public static boolean positiveOrNot(String str) {
		int l=str.length();
		for(int i=0;i<l-1;i++) {
			if(str.charAt(i)>str.charAt(i+1))
				return false;
		}
		return true;

	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		System.out.println(positiveOrNot(s));
		}
