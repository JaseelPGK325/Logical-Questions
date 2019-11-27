package preps;
import java.util.*;
public class nthfib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);

System.out.println("enter n");
int n=s.nextInt();
int nn=n;
int a=0,b=1,c=0;

for(int i=0;i<n-2;i++)
{
	 c=a+b;
	
	a=b;
	b=c;

	}

System.out.println(nn+"th fibonocci number is "+c);
}
}