package pattern;
import java.util.*;
public class cskstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter size");
int n=s.nextInt();
for(int i=0;i<=n;i++) {
	for(int j=0;j<n;j++) {
		if(i==0) {
			System.out.print("c");
		}else if(i==n) {
			System.out.print("k");
		}else if(j==0||j==n-1) {
			System.out.print("s");
		}else {
			System.out.print("*");
		}
	}System.out.println();
}
	}

}
