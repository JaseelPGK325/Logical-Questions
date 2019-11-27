package preparation;
import java.util.*;
public class heightupdownproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("height of mountain");
        double height=sc.nextDouble();
        System.out.println("logan's climb value in first attempt ");
        int x=sc.nextInt();
        System.out.println("logan's slips down value");
        double z=sc.nextDouble();
        System.out.println("mason's climb value in first attempt ");
        int y=sc.nextInt();
        System.out.println("mason's slips down value");
        double w=sc.nextDouble();
        int s=x;
        int attempt=1;
        while(s<height)
        {
            s+=x;
            s-=z/100*s;
            attempt++;
        }
        System.out.println(attempt);
        int t=y;
        int attempt1=1;
        while(t<height)
        {
            t+=y;
            t-= w/100*t;
            attempt1++;
        }
        System.out.println(attempt1);
        if(attempt<attempt1)
            System.out.println("\"Mr.Logan first reaches the top\"");
        else if(attempt==attempt1)
            System.out.println("\"Both reaches the top at same time\"");
        else
            System.out.println("\"Mr.Mason first reaches the top\"");
	}

}
