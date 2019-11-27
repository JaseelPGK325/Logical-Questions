package pattern;
import java.util.*;
public class pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter String");
		String a=s.next();
		int n=a.length();
		for(int i=n;i>=0;i--) {
			for(int j=0;j<n;j++) {
	char c=a.charAt(j);
			if(i>j) {
				System.out.print(c+" ");
			}else {
				System.out.print(" ");
			}
		}System.out.println();
	}
	}

}
