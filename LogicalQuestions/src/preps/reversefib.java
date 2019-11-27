package preps;
import java.util.*;
public class reversefib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=0;
int a1=a;
int b=1;
int b1=b;
System.out.println("enter n");
int n=s.nextInt();
for(int i=n;i>=2;i--)
{
	int c=a+b;
	
	a=b;
	b=c;
	System.out.println(c);
	}
System.out.println(b1);
	System.out.println(a1);

	}

}
