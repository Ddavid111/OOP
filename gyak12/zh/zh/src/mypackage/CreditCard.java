package mypackage;

import java.time.LocalDate;


public class CreditCard extends Card{

	

	private int hitelkeret;
	
	public CreditCard(String name, LocalDate ervenyes, int egyenleg, Bank b) {
		super(name, ervenyes, egyenleg, b);
		this.hitelkeret=100000;
	}
	
	public CreditCard(String name, LocalDate ervenyes, int egyenleg, Bank b,int hitelkeret) {
		super(name, ervenyes, egyenleg, b);
		this.hitelkeret=hitelkeret;
	}
	
	
	@Override
	public boolean penzfel(int osszeg)
	{
		if(((getEgyenleg()-osszeg)+getHitelkeret())<=0)
		{
			return false;
		}
		else if(getErvenyes().isBefore(LocalDate.now()))
		{
			return false;
			
		}
		else {
			if((getEgyenleg()-osszeg+getHitelkeret())<=getHitelkeret()){
			setHitelkeret(hitelkeret+(getEgyenleg()-osszeg));
			}
			this.setEgyenleg(getEgyenleg()-osszeg);
			
			return true;
			} 
		
		
	}

	@Override
	public String toString() {
		return "CreditCard [hitelkeret=" + hitelkeret + ", getName()=" + getName() + ", getErvenyes()=" + getErvenyes()
				+ ", getEgyenleg()=" + getEgyenleg() + ", getB()=" + getB() + "]";
	}

	public int getHitelkeret() {
		return hitelkeret;
	}

	public void setHitelkeret(int hitelkeret) {
		this.hitelkeret = hitelkeret;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
