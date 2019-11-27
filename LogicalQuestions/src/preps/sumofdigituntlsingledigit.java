package preps;
import java.util.*;
public class sumofdigituntlsingledigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter number");
	int n=s.nextInt();
	if(n==0) {
		System.out.println("Sum of digits until a single digit of "+n+" is "+n);
		}
	else if(n%9==0) {
		System.out.println("Sum of digits until a single digit of "+n+" is 9");
	}else {
		System.out.println("Sum of digits until a single digit of "+n+" is "+n%9);
	}
	}

}
