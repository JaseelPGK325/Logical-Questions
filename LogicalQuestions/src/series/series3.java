package series;
import java.util.*;
public class series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter series size");
	int n=s.nextInt();
	System.out.print("1 ");
	float a=2,b=3,c=0;
	System.out.print(a+" ");
	System.out.print(b+" ");
	for(int i=3;i<n;i++) {
		if(i%2==1) {
			c=a*3;
			System.out.print(c+" ");
			a=c;
			
		}else {c=b*3;
		System.out.print(c+" ");
		b=c;
	}
	
	}

}}