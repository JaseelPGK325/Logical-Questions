package preps;
import java.util.*;
public class primefactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
System.out.println("enter number");
int n=s.nextInt();
int f=0;int sum=0;
System.out.println("prime factors of "+n+" are :");
for(int i=2;i<=n;i++) {
	f=0;
	for(int j=2;j<=i/2;j++) {
		if(i%j==0) {
			f=1;
			break;
		}}
		if(f==0) {
			if(n%i==0) {
				System.out.println(i);}
			}
}

	}

}
