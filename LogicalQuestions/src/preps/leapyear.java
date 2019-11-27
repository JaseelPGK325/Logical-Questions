package preps;
import java.util.*;
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter year");
int year=s.nextInt();
int a=year%400;
int b=year%100;
int c=year%4;
if(a==0||c==0&&b!=0) {
	System.out.println(year+" is a leap year");
	
}
else {

	System.out.println(year+" is not a leap year");
}
	}	}

