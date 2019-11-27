package preps;
import java.util.*;
public class secondgreat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter first number");
	int a=s.nextInt();
	System.out.println("enter second number");
	int b=s.nextInt();
	System.out.println("enter third number");
	int c=s.nextInt();
	 if(a>=b&&a>=c)
	    {
	        if(b>=c)
	        {
	            
	            
	            System.out.println(b+" is the 2nd largest number");
	        }
	        else
	        {
	        	 System.out.println(c+" is the 2nd largest number");
	        }
	    }
	    else if(b>=a&&b>=c)
	    {
	        if(a>=c)
	        {
	        	 System.out.println(a+" is the 2nd largest number");
	        }
	        else
	        {
	        	 System.out.println(c+" is the 2nd largest number");
	    }}

	 
	    else if(a>=b)
	    {
	    	 System.out.println(a+" is the 2nd largest number");
	    }
	    else 
	    {
	    	 System.out.println(b+" is the 2nd largest number");
	    }

	  
	}

	}


