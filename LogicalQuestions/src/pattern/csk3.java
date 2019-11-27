package pattern;
import java.util.*;
public class csk3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter pattern size");
int n=s.nextInt();
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		if(i==0) {
			System.out.print("c");
		}else if(i==n-1) {
			System.out.print("k");
		}else if(i==1||i==n-2) {
			if(j%2==0) {
			System.out.print("*");
		}else {
				System.out.print("s");
			}}
		else {
				System.out.print("*");
			}
		}
	System.out.println();

	}}
	}

