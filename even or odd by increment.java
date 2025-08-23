import java.util.*;
public class Main
{
    void qwer(int x){
        x++;
        if(x%2==0){
            System.out.print("odd");
        }
        else{
            System.out.print("even");
        }
    }
	public static void main(String[] args) {
	  Scanner su=new Scanner(System.in);
	  int n=su.nextInt();
	  Main uv=new Main();
	  uv.qwer(n+1);

	}
}
