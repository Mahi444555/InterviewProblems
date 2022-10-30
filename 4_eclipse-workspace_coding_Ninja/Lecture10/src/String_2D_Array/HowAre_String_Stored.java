package String_2D_Array;
import java.util.Scanner;
public class HowAre_String_Stored {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in); //creating scanner object 
	String str="abc";
			str=str + "def";				//concatinate/joining string with def string
	System.out.println(str);

									//function for concatinate the string with another string
	
	System.out.println(str.concat("ghi"));		
	System.out.println(str);	//here we print original string here not get added ghi hence o/p=abcdef
		
	
	//non-primitive data type array comparing 
	int arr1[]= {1, 2, 3};		//array arr1 its array_name its refer only address of array1 eg 1002
	int arr2[]= {1, 2, 3};		//same arr2 its refers address of arr2 	eg 600
	
	
	
	if(arr1 == arr2)			//arr1 stores=1002 not 1 2 3 and arr2 stores=600 then 1002==600 false
	
	{
		System.out.println("equal");	
	}
	else
	{
		System.out.println("unequal");
	}
	
	System.out.println(arr1 + "==both address equal or not check==" + arr2);
	//System.out.println(arr2);
	
//String how its work when two sting contains same data and we compare 
	
	String str1="abcd";
	String str2="abcd";		//both are same then both refers to same string and same containt
	
	if(str1 == str2) {	//if two string contains same data then in memory it stored only once 
		System.out.println("equal");
	}
	else {
		System.out.println("unequl");
	}
	}
}
