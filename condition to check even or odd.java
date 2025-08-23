2           import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner uv=new Scanner(System.in);
		int n=uv.nextInt();
		if(n>=1 && n<=25){
		    if(n%2==0){
		        System.out.print(n*2);
		    }
		    else{
		        System.out.print(n/2);
		    }
		}
		else if(n>=26 && n<=50){
		    if(n%2==0){
		        System.out.print(n*2);
		    }
		    else{
		        System.out.print(n/2);
		    }
		}
		else if(n>=51 && n<=75){
		     if(n%2==0){
		        System.out.print(n*2);
		    }
		    else{
		        System.out.print(n/2);
		    }
		}
		else if(n>=76 && n<=100){
		     if(n%2==0){
		        System.out.print(n*2);
		    }
		    else{
		        System.out.print(n/2);
		    }
		}
		else if(n>100){
		    System.out.print(n+1000);
		}
	}
}
