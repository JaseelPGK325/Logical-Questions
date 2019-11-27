package preparation;
import java.util.Scanner;
public class Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int a=s.nextInt();
		int count = 0;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				count++;}}
				if(count==0) {
		System.out.println("prime number");
				}
				
				else {
		System.out.println("not a prime number");
					}
			}
}