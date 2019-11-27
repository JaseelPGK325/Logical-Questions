package preparation;
import java.util.*;
public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int large=0,temp,secondlarge=0;
System.out.println("no.of elememts in array");
int n=s.nextInt();
System.out.println("enter the elements of array");
for( int i = 0;i<n;i++) {
	if(i==0)
	{
		large=s.nextInt();
	}else {
		temp=s.nextInt();
		if(temp<large) {
			secondlarge=large;
		}else if(temp>secondlarge) {
			secondlarge=temp;
		}
	}
}s.close();
System.out.println("second largest number in given array is "+secondlarge);
	}

}
