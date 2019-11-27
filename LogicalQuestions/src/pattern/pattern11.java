package pattern;
import java.util.Scanner;
public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter pattern size");
	int n=s.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=((2*i)+1);j++) {
			if(j==i+1) {
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
		}System.out.println();
	}
	}

}
