//program for array in java with functions write separate functions in for fibonacci series of array elements
import java.util.Scanner;
public class Arrayinjava {

	public static void fibo(int n) {
		int a[]=new int[n];
		a[0]=0;		//index 0th location storing a[0]=  0
		  a[1]=1;		//index 1st location storing a[1]= 1
		  System.out.println("enter array elements");
		  for(int i=2;i<=n-1;i++)		//in fibonacci series array start from 2
		  {
			a[i]=a[i-1] + a[i-2];		//a[2]=a[2-1]+a[2-2]= a[1]+a[0] adding previous two terms to get next term
			
		  }
		  for(int i=0;i<=n-1;i++) 	//here accessing array elements which we stored in array & print from 0ton-1
		  {
			  System.out.println("array elements" + i + " " + a[i]);
		  }
		  
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		fibo(x);		//calling fibo and passsing n's value 
/*	int a[]=new int[n]; //where integer type of array name=fn; new= is the keyword that allocates the memory
								// to us now we storign integer type of size[n]
	  a[0]=0;		//index 0th location storing a[0]=  0
	  a[1]=1;		//index 1st location storing a[1]= 1
	  System.out.println("enter array elements");
	  for(int i=2;i<=n-1;i++)		//in fibonacci series array start from 2
	  {
		a[i]=a[i-1] + a[i-2];		//a[2]=a[2-1]+a[2-2]= a[1]+a[0] adding previous two terms to get next term
		
	  }
	  for(int i=0;i<=n-1;i++)
	  {
		  System.out.println("array elements" + i + " " + a[i]);
	  }
	*/  
   }
}
