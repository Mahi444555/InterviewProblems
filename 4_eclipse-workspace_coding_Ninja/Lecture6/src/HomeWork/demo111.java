package HomeWork;

import java.util.Scanner;

public class demo111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,max,min;
		int[] a = new int[5];	//i=iterations max=maximum, min=minimum, a=array name of size 20
		
		for(i=0;i<=n-1;i++)		//these loop is use for taking my array elements 0 to less than no i.e. 0ton-1
		{
			//System.out.print(" array element:i");
			a[i]=sc.nextInt();		//taking i's value
			
		}
		max=min=a[0];		//assigning max and min is my 0th array element number
		
		for(i=0;i<=n-1;i++)		//these loop is use for checking from 0th element to n-1 who is max and min
		{
			if(a[i]>max)
				max=a[i];
			
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("maximum"+max);
		System.out.println("minimum"+min);
	}

}
