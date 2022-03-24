package myperson;

import java.util.Scanner;

public class PersonTest {

	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
		
		
		

	}
	
	public static String readStringwithbuffer()
	{
		String answear;
		input.nextLine();
		System.out.println("Enter the string: ");
		while(input.hasNextInt())
		{
			
		System.out.println("Wrong input! Please retry: ");
		input.nextLine();
		}
		answear=input.nextLine();
		return answear;
		
		
		
	}

	public static String readString()
	{
		String answear;
		System.out.println("Enter the string: ");
		while(input.hasNextInt())
		{
			System.out.println("Wrong input! Please retry: ");
			input.nextLine();
		}
		answear=input.nextLine();
		return answear;
	}
	
	public static int readInteger()
	{
		int answear;
		System.out.println("Enter the number: ");
		while(!input.hasNextInt())
		{
			System.out.println("That's not a number! Please retry: ");
			input.next();
		}
		answear=input.nextInt();
		return answear;
		
	}
	
}
