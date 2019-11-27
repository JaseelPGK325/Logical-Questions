package preps;
import java.util.*;
public class Strong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		int m=n;
		int sum=0;
		while(n!=0) {
			int f=1;
			int b=n%10;
			for(int i=1;i<=b;i++) {
				f=f*i;
			}
			sum=sum+f;
			n=n/10;
		}
		if(sum==m) {System.out.println("Strong number");}
		else {
			System.out.println("not strong number");
		}
		
		// TODO Auto-generated method stub

	}

}
