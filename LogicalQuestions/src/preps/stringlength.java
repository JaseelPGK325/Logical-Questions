package preps;
import java.util.*;
public class stringlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String a=s.nextLine();
String b=a.replaceAll(" ","");
int n=b.length();
System.out.println("length of the given string is "+n);
	}

}
