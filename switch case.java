import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    switch(n)
	    {
	        case 1:
	            System.out.print("One");
	            break;
	       case 2:
	           System.out.print("Two");
	           break;
	       case 3:
	           System.out.print("Three");
	       default:
	       System.out.print("Invalid answer");
	       break;
	    }
	}
}
