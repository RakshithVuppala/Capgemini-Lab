import java.util.*;
import java.lang.Math;
public class Main{
    
    static boolean checkNumber(int n){
        int x=(int)(Math.log(n)/Math.log(2));
        
        return (Math.ceil(x)==Math.floor(x));
    }

     public static void main(String []args){
         System.out.println(checkNumber(8));
     }
}
