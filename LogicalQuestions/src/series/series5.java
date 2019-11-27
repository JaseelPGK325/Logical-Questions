package series;

import java.util.Scanner;

public class series5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter series size");
int n=s.nextInt();
float a=(float) .5;
for(int i=1;i<=n;i++) {
	System.out.print(a+" ");
	a=3*a;
}
	}

}
