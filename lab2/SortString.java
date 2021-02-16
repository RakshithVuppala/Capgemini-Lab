package lab2;
import java.util.*;
public class SortString {

	public static String[] sortString(String[] str){
		int l=str.length;
		Arrays.sort(str);
		for(int i=0;i<l;i++)
		{
			String temp=str[i];
			int a=temp.length();
			String s=new String();
			s=temp.substring(0, a/2).toLowerCase();
			s+=temp.substring(a/2).toUpperCase();
			str[i]=s;
	}
		return str;
	}
	
	public static void main(String[] args) {
		
		String[] str= {"Anirudh","Raghu","Rakesh"};
		String[] result=sortString(str);
		for(String s:result) {
			System.out.println(s);
		}

	}

}
