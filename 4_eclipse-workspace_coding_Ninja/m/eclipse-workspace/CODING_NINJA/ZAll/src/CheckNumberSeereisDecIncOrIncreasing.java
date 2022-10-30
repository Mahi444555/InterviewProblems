//program for Check Number series is print true if order is strictly decreasing only or increasing only or dec then incr
// print false if strictly inc then dec or decrease then increase then decrese print false for that take boolean 
// boolean isDec=true i.e. if order is decreasing then true 

import java.util.Scanner;
public class CheckNumberSeereisDecIncOrIncreasing {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	//creating Scanner object sc.
		int N=sc.nextInt();
		boolean isDec = true;		//making boolean datatype only store t/f 1/0  isDec i.e. Decreasing order then true
		
		int prev=sc.nextInt();		//1st number previous
		int current=sc.nextInt();	//2nd number or nextnum as current
		
		int i=1;
		while(i<N-1)	//where i iterates till N-1
		{
			if(current == prev)		//1st conditon both number are if same then false  10 14 14 not increse not decrese
			{
				System.out.println("false");
				return;
			}
			
			else if(current > prev)		//2d condition (increasing order)cur > previous 2nd num is greater than 1st 1 2 
			{
				isDec=false;	//then our isDec is get false because now its increasing order not decreasing 
				if(isDec==true)		//if isDec is get's true after increasing order then print false
				{
					System.out.println("false");
					return;
				}
			}
		  else if(current < prev)	//3rd condition (decreasing order) i.e. now current is less than previous numner 10 8
		   {
			  if(isDec==false)	//i.e. these is decreasing order i.e. means actually our isDec is true now but if its get 
			     { 					       //false then print false
				    System.out.println("false");
				     return;					//return means stop execution
			     }
		   }
			prev= current;  //here im making nextnumber is my now previous and comparing with new one number 
			
			current=sc.nextInt();
			i++;
					
			}
			System.out.println("true");		//these only execute if  condition get false
		}
		
	}


