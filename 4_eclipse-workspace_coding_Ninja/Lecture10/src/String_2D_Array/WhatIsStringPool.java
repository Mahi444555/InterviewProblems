package String_2D_Array;

public class WhatIsStringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		String t="abc";
		String r="abc";
		if(s==t || t ==r) {
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		int arr1[]= {1,2,2};
		int arr2[]= {1,1,3};
		//int arr2[]=arr1;	//here assign arr1 to array
		if(arr1==arr2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
