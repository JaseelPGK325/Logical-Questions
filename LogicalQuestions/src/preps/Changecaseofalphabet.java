package preps;
import java.util.*;
public class Changecaseofalphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the character");
char c=s.next().charAt(0);
if(c>=65&&c<=90) {
	c=(char) (c+32);
	System.out.println(c);
}else {
	c=(char) (c-32);
	System.out.println(c);
}

	}

}
