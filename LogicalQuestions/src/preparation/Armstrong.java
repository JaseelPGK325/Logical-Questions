package preparation;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
	int n=s.nextInt();
	int a=n;
	int arm=0;
	while(n>0) {
		int r=n%10;
		arm=(r*r*r)+arm;
		n=n/10;
		
	}
	if(a==arm) {
		System.out.println("arm strong number");}
		else {
			System.out.println("not armstrong number");
		}
	}
	}

