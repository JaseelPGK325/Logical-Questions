package preps;
import java.util.*;
public class perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int sum=0;
for(int i=1;i<n;i++) {
	int r=n%i;
	if(r==0) {
		sum=sum+i;
		
	}}
	if(n==sum) {
		
		System.out.println("perfect number");
	}else {
		System.out.println("not perfect number");
	}
	
}

}
