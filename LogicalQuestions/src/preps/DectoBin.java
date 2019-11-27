package preps;
import java.util.*;
public class DectoBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int n=s.nextInt();
String a="";
while(n>0) {
	int x=n%2;
	a=x+a;
	n=n/2;
	
}
System.out.println(a);

	}

}
