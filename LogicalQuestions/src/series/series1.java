package series;
import java.util.*;

public class series1 {

	public static void main(String[] args)  {
		Scanner s=new Scanner(System.in);
		System.out.println("size of series");
		int n=s.nextInt();
	
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				System.out.print(i*i-1+" ");
			}else {
				System.out.print(i*i-2+" ");
			}
		}
	
	
	}
	}
