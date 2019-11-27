package preps;
import java.util.Scanner;
public class Palindrome1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the String");
String n=s.next();
String reverse="";
int i;
for( i=n.length()-1;i>=0;i--) {
	reverse=reverse+n.charAt(i);
}
if(n.equals(reverse)) {	
	System.out.println("palindrome");
}
else {
	System.out.println("not palindrom");
}
}
}