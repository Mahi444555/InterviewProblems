import java.util.Scanner;
public class capgiminiRotateArrayRightBy_d_places {

/*
	public static void ArrayRotateRight(int arr[], int d)
	{
		int n=arr.length;	//1stly access array size/length
		while(d>0)	//we have to rotate our array by d times hence these conditon and decreases
		{
			int temp=arr[n-1];
			for(int i=n-1;i>=1;i--) {	//i have to rotate array in right side -> then last index
											// i.e. n-1 ha empty sodan padan hence i<n-1
				
				arr[i]=arr[i-1];
				
			}
			arr[0]=temp;
			d--;
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
*/	
	public static void ArrayRotateRight(int arr[], int d) {
		int n=arr.length;
		int temp[]=new int[arr.length];	
		//my new temporary array which stored directly from dth index if d=2 then 
		//then it will directly stored 2nd index element of original array arr in temp[0] th
		for(int i=d;i<arr.length;i++) {
			//hence directly start from d (i=d) eg d=2 then i<arr.length i.e. 2<5 from 2 to 4
			temp[i-d]=arr[i];	//here just storing original array's 2nd index in 0th index of temp
				//i also initialize by d thne i=2 and d=2 2-2=0  then temp[0]=arr[2]		
		}
		for(int i=0;i<d;i++) {//here we have to only take d times iteration for again stors remain
						//remaining array elements in temp now 0th and 1st index elemtn we soting
			temp[arr.length-d+i]=arr[i];	//temp[5-2+0]=arr[0] i.e temp[3]=arr[0]	
		}
	for(int i=0;i<n;i++)
	{
		arr[i]=temp[i];	//here just assgin all temporaray array to original array agian after rotate
	}
	for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
	}			
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)	
		{
			arr[i]=sc.nextInt();
		}
		int d=sc.nextInt();
		ArrayRotateRight(arr,d);	//calling function ArrayRotateRight and passing array and d
	}									//where d= is no of rotation to be done...

}
