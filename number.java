import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner na=new Scanner(System.in);
	    System.out.print("enter the number");
	    int n=na.nextInt();
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            if(i+j<n)
	            System.out.print(n-Math.min(i,j)+" ");
	            else
	            System.out.print(Math.max(i,j)+1+" ");
	        }
	        System.out.println("");
	    }
	}
}
