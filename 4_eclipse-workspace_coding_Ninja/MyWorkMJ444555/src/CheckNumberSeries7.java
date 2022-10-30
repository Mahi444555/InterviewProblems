//program for to print true or false accoriding to the number sereis 
//print true if series strictly increasing or decreasing or decreasing then at some point increasing 
//print false if sereis is strictly increasing then decreasing or dec then incr then dec take boolean for tract the numbe
import java.util.Scanner;
public class CheckNumberSeries7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		boolean isDec=true;		//only true in decreasing order isDec is for Decreasing order
		
		int prev=sc.nextInt();		//previous is my 1st number
		int current=sc.nextInt();	//current is my 2nd number or next number which we comaparing with
		int i=1;
		while(i<N-1) {
		if(current==prev)		//1st condition both are same no not increasing not decreasing then print false
		{
			System.out.println("false");
			return;					//where return means stop execution
		}		
		else if(current>prev)		//2nd condition increasing order 
		{	
			isDec=false;		//isDec only true is decreasing order phase hence we initialize it false in increasing
			if(isDec==true)			// if its true then print false i.e.increaisng then decreasing number comes
			{
				System.out.println("false");
				return;
			}
		}
		else if(current<prev)		//3rd condition decreasing order
		{
			if(isDec==false) //these is alreay decreasing order then isDec is already true if its get flase then false
			{
				System.out.println("false");
				return;
			}
		}
		prev=current;		//here making our current i.e. next no is previous and comparing with new one no 
		current=sc.nextInt();
		i++;
		}
		
		System.out.println("true");
	}

}
