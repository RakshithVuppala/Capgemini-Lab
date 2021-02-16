package lab3;
import java.util.*;
import java.lang.*;

public class MirrorImage {
/*Create a class containing a method to create the mirror image of a String. 
The method should return the two Strings separated with a pipe(|) symbol .*/
	public StringBuffer getImage (String s) {
		StringBuffer src=new StringBuffer(s);
		StringBuffer rev=new StringBuffer(s);
		rev.reverse();
		src.append("|");
		src.append(rev);
		return src;
	}
	
	public static void main(String[] args) {
		MirrorImage img=new MirrorImage();
		System.out.println(img.getImage("EARTH"));

	}

}
