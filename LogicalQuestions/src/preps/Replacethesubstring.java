package preps;
import java.util.*;
public class Replacethesubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String main=s.nextLine();
System.out.println("enter which substring is want you replace");
String sub1=s.nextLine();
System.out.println("enter which substring is add in position of replace substring");
	String sub2=s.nextLine();
	System.out.println("The given string after replacement :\n");
	System.out.println(main.replaceAll(sub1, sub2));
	}

}
