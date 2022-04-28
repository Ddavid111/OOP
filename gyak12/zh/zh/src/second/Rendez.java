package second;

import java.util.Comparator;

import mypackage.Card;

public class Rendez implements Comparator <Card>{

	@Override
	public int compare(Card o1, Card o2) {
		
		if(o1.getErvenyes().isBefore(o2.getErvenyes()))
		{
			
			return 1;
			
		}
		if(o2.getErvenyes().isBefore(o1.getErvenyes()))
		{
			return -1;
			
			
		}
		
		
		
		
		else {
		return 0;}
	}
	
	
	
	
	
	
	
	
	
	
	
}
