import java.util.Scanner;
import java.lang.Math; 


public class Main
{

    public static int calculateDifference(int n){
        int sum1=0;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum1+=i*i;
            sum+=i;
        }
        return sum1-(sum*sum);
    }

	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int x=input.nextInt();
	    int result=calculateDifference(x);
	    System.out.println(result);
	}
}
