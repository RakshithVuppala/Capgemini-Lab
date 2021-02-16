package lab2;
import java.util.*;
import java.lang.*;
public class GetSorted {
	
	public static int[] getSorted(int[] arr) {
		int l=arr.length;
		String str="";
		for(int i=0;i<l;i++) {
			str=""+arr[i];
			StringBuilder temp=new StringBuilder(str);
			temp.reverse();
			arr[i]=Integer.parseInt(temp.toString());
			//System.out.println(temp);
			//arr[i]=temp;
		}
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {
		int[] arr= {35,67,89,23,45};
		int[] result=getSorted(arr);
		for(int i:result)
			System.out.println(i);
	}

}
