import java.util.Scanner;
import java.lang.Math; 


public class Main
{

    public static int calculateSum(int n){
        int counter=2;
        int sum=0;
        while(n!=0){
            if(counter%3==0 && counter%5==0){
                sum+=counter;
                n--;
            }
            counter++;
        }
        return sum;
    }

	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int x=input.nextInt();
	    int result=calculateSum(x);
	    System.out.println(result);
	}
}

*************************************************************

import java.util.Scanner;
import java.lang.Math; 


public class Main
{

    public static int calculateSum(int n){
        int counter=3*5;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=counter*i;
            
        }
        return sum;
    }

	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int x=input.nextInt();
	    int result=calculateSum(x);
	    System.out.println(result);
	}
}