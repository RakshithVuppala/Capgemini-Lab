	public static int modifyNumber(int number1) {
		int l=Integer.toString(number1).length();
		int arr[]=new int[l];
		int i=0;
		while(number1>0) {
			arr[l-i-1]=number1%10;
			i++;
			number1/=10;
		}

		String result=new String();
		for(int j=0;j<l-1;j++) {
			String a=""+Math.abs(arr[j]-arr[j+1]);
			result+=a;
		}
		result+=arr[l-1];
		return Integer.parseInt(result);
	}

	public static void main(String[] args) {
		int a=modifyNumber(45862);
		System.out.println(a);

	}
