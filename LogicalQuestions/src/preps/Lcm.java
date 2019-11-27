package preps;
import java.util.*;
public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter first number");
	int n1=s.nextInt();
	System.out.println("enter second number");
	int n2=s.nextInt();
	int max=(n1>n2)?n1:n2;
	int lcm=0;
	for(int i=max;i<=n1*n2;i++) {
		
		if(i%n1==0&&i%n2==0) {
			 lcm=i;
			break;
			
		}
		
	}
	
	System.out.println("LCM of "+n1+" and "+n2+" is "+lcm);
	}

}
