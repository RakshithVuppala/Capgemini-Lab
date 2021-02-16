import java.util.Scanner;
import java.lang.Math; 


public class Main
{
    public static void fibonacciSequence(int x){
        int a=1,b=1;
	    int c;
	    
	    for(int i=2;i<x;i++){
	        c=a+b;
	        a=b;
	        b=c;
	    }
	    System.out.println(b);
}

	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int x=input.nextInt();
	    fibonacciSequence(x);
	    
	}
}