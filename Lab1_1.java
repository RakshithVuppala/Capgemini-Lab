import java.util.Scanner;
import java.lang.Math; 
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int sum=0;
		while(n>0){
		    sum+=n%10;
		    n/=10;
		}
		System.out.println("The sum of digits of n numbers is: "+sum);
	}
}
