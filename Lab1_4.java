import java.util.Scanner;
import java.lang.Math; 


public class Main
{


	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter a number: ");
	    int x=input.nextInt();
	    int y;
	    for(int i=2;i<x;i++){
	        y=0;
	        
	        for(int j=2;j<i;j++){
	            if(i%j==0){y=1;}
	        }
	        if(y==0){
	            System.out.println(i);
	        }
	    }
	    
	}
}
