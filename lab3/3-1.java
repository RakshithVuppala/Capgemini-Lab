
import java.util.*;
public class Main{

     public static void main(String []args){
        int n;
        int sum=0;
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter numbers with a space");
        String s=input.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        
        while(st.hasMoreTokens()){
            String a=st.nextToken();
            n=Integer.parseInt(a);
            sum+=n;
        }
        
        System.out.println(sum);
     }
}
