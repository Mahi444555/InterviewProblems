package Homeworkk1;
import java.util.Scanner;
public class leanearSearchAgainF2 {

	public static int match(int arr[], int x)		//where arr[] ie. passing array and x is that no which match check
	{
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(x==arr[i])	//if matched our number i.e. x with any array element then print index location of that no
			
				return i;
		}
			return -1;
		
	}
	
	
	public static int[] takeInput()		//these function returns a array hence datatype as int[]
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];		//my integer type of array
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();		//accepting values from user and storing in array
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();		//where t=choices no of cases
			//no to be matched in array element
		
		int l=1;
		while(l<=t)		//l is iterate till choices how many choices user want if l=2 then two times
		{
			int x=sc.nextInt();	
			int m[]= takeInput();		//calling takeInput function it will returns us array arr 
		
			int result= match(m,x);
			System.out.println(result);
			l++;
		}
	}

}
