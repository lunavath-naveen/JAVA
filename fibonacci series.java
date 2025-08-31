import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner na=new Scanner(System.in);
	    System.out.print("enter the number");
	    int n=na.nextInt();
	    int a=1,b=1,c;
	    System.out.print(a+" "+b);
	    for(int i=0;i<=n;i++){
	        c=a+b;
	        System.out.print(c);
	        a=b;
	        b=c;
	       
	    }
	}
}
