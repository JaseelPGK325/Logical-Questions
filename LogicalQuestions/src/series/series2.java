package series;
import java.util.*;
public class series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter series size");
	int a=11;
int n=s.nextInt();
	for(int i=0;i<n;i++)
	{
		System.out.print(a*a+" ");
		a=a+4;
	}
	}

}
