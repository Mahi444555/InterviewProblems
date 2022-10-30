package lecture1;
import java.util.Scanner;
public class FehTocel {

	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		int f=sc.nextInt();		//taking fehranite value from user..
		
		
		/*int cel=(5/9)*(f-32);			//here int/int=gives integer and division(/)=quitient part..
		 							 	5/9=0 hence 0*(f-32)
		 								(0 x any thing) gives 0 hence logical erro...*/
		
		
		
		
		float cel=(5*(f-32)/9);		//now its gives correct output but only integer part...
		System.out.println(cel);
		
		
		
		System.out.println(9/5);		//division(/)gives=quoitient part only...
		System.out.println(9.0/5);	//doubel/integer=double...
		System.out.println(9+5);
		System.out.println(9-5);
		System.out.println(9*5);
		System.out.println(9/5);
		System.out.println(9%5);
		
		
	
	}

}
