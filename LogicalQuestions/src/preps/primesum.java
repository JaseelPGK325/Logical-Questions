package preps;
import java.util.*;
public class primesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the limit");
int n=s.nextInt();
int f=0;int sum=0;
for(int i=2;i<=n;i++) {
	f=0;
	for(int j=2;j<=i/2;j++) {
		if(i%j==0) {
			f=1;
			break;
		}}
		if(f==0) {
			sum=sum+i;
	}
}System.out.println(sum);
	}

}

