package preps;
import java.util.*;
public class Deletevowelsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String a=s.nextLine();
System.out.println(a.replaceAll("[aeiouAEIOU]", ""));
	}

}
