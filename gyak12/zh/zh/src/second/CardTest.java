package second;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import mypackage.Card;
import mypackage.Card.Bank;


public class CardTest  {

	static Scanner input=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
		int d = read();
		System.out.println(d);
		
		Card [] c=new Card[d];
		
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println("Adja meg a nevet:");
			String name=input.next();
			System.out.println("Adja meg az ervenyesseget:");
			String ervenyesseg=input.next();
			LocalDate e=LocalDate.parse(ervenyesseg);
			System.out.println("Adja meg a bankot:");
			String bank=input.next();
			Bank a=Bank.valueOf(bank.toUpperCase());
			System.out.println("Adja meg az egyenleget:");
			int egyenleg=input.nextInt();
			System.out.println("Adja meg a hitelkeretet:");
			int hitel=input.nextInt();
			
			c[i]=new Card(name,e,egyenleg,a);
		}
		System.out.println(c[0].penzfel(100000));
		System.out.println(c[1].penzfel(90000));

		
		System.out.println("Rendezes: ");
		
		Arrays.sort(c,new Rendez());
		for(Card e:c)
		{
			System.out.println(e);
			
			
		}
		
	}

	 public static int read() {
		 int min=1;
		 int max=10;
	        int number = 0;
	        do {
	            System.out.println("Enter an integer between " + min + " and " + max + "!");
	            while (!input.hasNextInt()) {
	                System.out.println("Must be an integer between 1 and 10!");
	                input.next();
	            }
	            number = input.nextInt();
	        } while (number < min || number > max);

	        return number;
	    }
	
	public int CIB(Card [] c1)
	{
		int count=0;
		for(int i=0;i<c1.length;i++) {
		if(c1[i].getB().toString().equals("CIB"))
		{
			count++;
			
			
		}
		
		}
		return count;
	}

//	@Override
//	public int compare(Card o1, Card o2) {
//		
//		if(o1.getErvenyes().isBefore(o2.getErvenyes()))
//		{
//			
//			return 1;
//			
//		}
//		if(o2.getErvenyes().isBefore(o1.getErvenyes()))
//		{
//			return -1;
//			
//			
//		}
//		
//		
//		
//		
//		else {
//		return 0;}
//	}
//	
	
	
	
	
	
}
