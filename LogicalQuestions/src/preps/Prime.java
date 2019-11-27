package preps;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int a=s.nextInt();
int f = 0;
for(int i=2;i<=a/2;i++) {
	if(a%i==0) {
		f=1;
		break;
	}
		
	}
	if(f==1) {
		System.out.println("neither prime number nor composite");
	}
	
	else {
		System.out.println("prime number");
		}
	
}}


