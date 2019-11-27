package pattern;
import java.util.Scanner;
public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
System.out.println("enter pattern size");
int n=s.nextInt();
for(int i=1;i<=n;i++) {
	for (int j=1;j<=n;j++) {
		
		if(j<=i)
		{	
			System.out.print(j+" ");
		}
		else {
		
			System.out.print("  ");
		}
	
	}for(int j=n;j>=1;j--) {
		if(j<=i) {
			System.out.print(j+" ");
		}
	}
	
	
	
	System.out.println();
	

}}}
	


