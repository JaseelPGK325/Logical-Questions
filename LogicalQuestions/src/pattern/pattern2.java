
package pattern;
import java.util.*;
public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter pattern size");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				
					System.out.print("* ");
					
				
			}
			System.out.println();
		}
	}

}
