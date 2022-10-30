package HomeWork;
import java.util.Scanner;
public class checkNumberSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();		//taking n form system	 
		int prev=sc.nextInt();				
		int current=sc.nextInt();
		boolean isDec=true;
		int i=1;			
		
		while(i<n-1)
		{
			if(prev==current) 
			{
				System.out.println("false");
				return;
			}
			else if(current>prev) //then its increasing
			{
				isDec=false;
				if(isDec==true)
				{
					System.out.println("false");
					return;
				}
			}
			else if(current < prev) 	//then its decreasing order phase current is nothing but nextno in series
			{
				if(isDec==false) 
				{
					System.out.println("false");
					return;
				}
			}
				prev = current;
				current = sc.nextInt();
			 i++;
			}
			System.out.println("true");
		}
	}
