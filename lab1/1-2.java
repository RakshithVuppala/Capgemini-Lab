import java.util.Scanner;
import java.lang.Math; 
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter 1 for Red, Enter 2 for Yellow, Enter 3 for Green");
	    int x = input.nextInt();
	    
	    switch(x){
	        case 1: System.out.println("Stop");
	        break;
	        case 2: System.out.println("Ready");
	        break;
	        case 3: System.out.println("Go");
	    }
	    
	}
}