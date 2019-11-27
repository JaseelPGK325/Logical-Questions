package series;
import java.util.*;
public class series4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter series size");
int n=s.nextInt();
int a=4;
for(int i=1;i<=n;i++) {
	System.out.print(a+" ");
	a=(i*i)+a;
}
	}

}
