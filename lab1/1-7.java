public class Main
{

    public static boolean checkNumber(int n){
        int x=n%10;
        n/=10;
        int y;
        while(n>0)
        {
            y=n%10;
            if(y>x){
                return false;
            }
            x=y;
            n/=10;
        }
        return true;
    }

	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int x=input.nextInt();
	    boolean result=checkNumber(x);
	    System.out.println(result);
	}
}