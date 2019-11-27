package preparation;

import java.util.Scanner;

public class Fib2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter n");
		int n=s.nextInt();
		int a=0;
		int b=1;int c = 0;
		if(n>2) {
			for(int i=2;i<n;i++) {
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println(c);
		}else {
			if(n==1) {
				System.out.println("0");
			}
			if(n==2) {
				System.out.println("1");
			}
		}
		

	}

}
