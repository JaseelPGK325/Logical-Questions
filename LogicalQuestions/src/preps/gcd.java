package preps;
import java.util.*;
public class gcd {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
System.out.println("enter first number");
int n1=s.nextInt();
	System.out.println("enter second number");
	int n2=s.nextInt();
	int gcd=0;
	for(int i=1;i<=n1&&i<=n2;++i)
	{
		if(n1%i==0 && n2%i==0)
			gcd=i;
	}
	System.out.println("gcd of "+n1+" and "+n2+" is "+gcd);

}
}
