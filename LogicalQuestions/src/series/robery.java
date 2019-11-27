package series;
import java.util.*;
public class robery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter no.of houses");
int n=s.nextInt();
int sr[]=new int[n];
int sum=0,sum1=0;
System.out.println("enter money in each no.of house");
	for(int i=1;i<=n;i++) {
		sr[i]=s.nextInt();
		if(i%2==1) {
		sum=sr[i]+sr[i+2];
		
	}else {
		sum1=sr[i]+sr[i+2];
		
	}
			}	if(sum>sum1)
			System.out.println(sum);
			else
				System.out.println(sum1);
	}

}
