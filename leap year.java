import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner su=new Scanner(System.in);
	  int n=su.nextInt();
	  if(n%4==0 && n%100!=0)
	  {
	      System.out.println("leap");
	  }
	  else if(n%100==0)
	  {
	      if(n%400==0)
	      {
	          System.out.println("leap year");
	      }
	      else{
	          System.out.println(" not leap");
	      }
	      
	  }
	  else{
	      System.out.println("not leap");
	  }
	}
}
