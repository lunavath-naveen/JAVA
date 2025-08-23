import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner na=new Scanner(System.in);
		System.out.print("enter number:");
		int n=na.nextInt();
		while(n>0)
		{
		    int a=na.nextInt();
		    if(a%2==0)
		    {
		        System.out.println("e");
		    }
		    else{
		        System.out.print("o");
		        n--;
		    }
		}
    }
}
