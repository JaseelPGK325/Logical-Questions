package series;
import java.util.*;
public class seriesnth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter term position");
int n=s.nextInt();
int a=0;
for(int i=1;i<=n;i++) {
	if(i%2==0) {
		 a=(n-1)/2;
	}else {
		
		a=(n-1);
	}
}System.out.println(a);
	}

}
