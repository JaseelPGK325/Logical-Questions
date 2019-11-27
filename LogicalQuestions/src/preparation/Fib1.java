package preparation;


import java.util.Scanner;

public class Fib1 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int a=0;
		int b=1;
	System.out.println("enter the number want to check");
	int n=s.nextInt();
	
		int f = 0;
		for(int i=2;i<2*n;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			if(c==n) {
			f = 1;
			break;}
			}
		if(f==1||n==0||n==1) {
			System.out.println(n+" is an element in Fibonacci series");
		}
		else {System.out.println(n+" is not an element in Fibonacci series");}	
		}
	}
