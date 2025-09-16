import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner na=new Scanner(System.in);
	    System.out.print("enter the number");
	    int n=na.nextInt();
	    int a=0,b=1,c;
	    System.out.print(a+" ");
	    for(int i=0;i<n-2;i++){
	        c=a+b;
	        if(c%2==0)
	        System.out.print(c+" ");
	        a=b;
	        b=c;
	    }
	}
}
