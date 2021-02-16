package lab2;
import java.util.*;
public class SecondSmall {
	
	public static int getSecondSmallest(Integer[] arr)
	{
		Arrays.sort(arr);
		int r=arr[1];
		return r;
	}
	public static void main(String[] args) {
		Integer[] arr= {4,5,2,3,7,8,9};
		int a=getSecondSmallest(arr);
		System.out.println(a);
	}

}
