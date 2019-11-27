package pattern;
import java.util.*;
public class cskpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter string");
String str=s.next();
System.out.println("enter pattern size");
	int n=s.nextInt();
	for(int i=0;i<=n;i++) {
		for(int j=0;j<str.length();j++) {
			char c=str.charAt(j);
			for(int k=0;k<=n;k++) {
				if(k<i)
					System.out.print(c);
			}
			
			
			
		}System.out.println();
	}
	
	
	}

}
