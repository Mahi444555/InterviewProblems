package while_loop;
import java.util.Scanner;
public class FehToCelscius {

	public static void main(String[] args) {
		
		   int  S ,E , W, C1 ;

	       Scanner sc=new Scanner(System.in);

	       S=sc.nextInt();

	       E=sc.nextInt();

	       W=sc.nextInt();

	       while(S<=E) 
	       {

	            C1=((5*(S-32))/9);

	         System.out.println(S+"\t"+C1);

	        S=S+W;
	       }
	}

}
