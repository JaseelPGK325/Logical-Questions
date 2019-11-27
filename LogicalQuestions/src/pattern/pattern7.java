package pattern;
import java.util.*;
public class pattern7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter pattern size");
	int n=s.nextInt();
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i<=j) {
				System.out.print((char)(i+j+65)+" ");
			}else {
				System.out.print("");
			}
                              }
		}System.out.print("");
	}
	
}
