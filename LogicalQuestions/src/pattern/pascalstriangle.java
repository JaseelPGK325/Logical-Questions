package pattern;
import java.util.*;
public class pascalstriangle {

	public static void main(String[] args) {
	
Scanner s=new Scanner(System.in);
System.out.println("enter pattern size");
int n=s.nextInt();
for(int i=0;i<n;i++) {
	int num=1;
	for(int k=n;k>i;k--) {
		System.out.print(" ");
	}
	for(int j=0;j<=i;j++) {
		System.out.print(num+" ");
		num=num*(i-j)/(1+j);
	}System.out.println();
}
	}

}
