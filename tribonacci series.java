import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner na=new Scanner(System.in);
	    System.out.print("enter the number");
	    int n=na.nextInt();
	    int a=0,b=1,c=1,d;
	    System.out.print(a+" "+b+" "+c+" " );
	    for(int i=0;i<n-3;i++){
	        d=a+b+c;
	        System.out.print(d+" ");
	        a=b;
	        b=c;
	       c=d;
	    }
	}
}
