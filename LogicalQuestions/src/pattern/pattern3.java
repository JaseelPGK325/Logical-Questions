package pattern;
import java.util.*;
public class pattern3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter pattern size");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>1;j--) {
				
					System.out.print(" ");			
				
			}
			for(int j=0;j<=i;j++) {
			System.out.print("* ");
			}System.out.println();
		}
	}

}
