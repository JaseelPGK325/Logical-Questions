package preps;
import java.util.*;
public class ReplaceMultipleConsecutiveoccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter string");
String a=s.next();
for(int i=0;i<a.length()-1;i++) {
char b=a.charAt(i);
char c=a.charAt(i+1);


if(b==c) {
	System.out.println(a.replace(b, (char) 0));
}}
	
	}
}
