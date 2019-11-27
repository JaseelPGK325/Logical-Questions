package preparation;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=n;
int r=0;
while(n!=0){
	int n1=n%10;
	 r=(r*10)+n1;
	n=n/10;
}
System.out.println(r);
if (a==r) {
	System.out.println("Palindrom number");
}else {System.out.println("not a Palindrom number");
}
	}

}
