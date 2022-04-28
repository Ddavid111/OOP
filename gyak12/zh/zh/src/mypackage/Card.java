package mypackage;

import java.time.LocalDate;

public class Card {

	private String name;
	private LocalDate ervenyes;
	
	public enum Bank{
		
		OTP,
		KH,
		ERSTE,
		CIB
		
		
	}
	private int egyenleg;
	private Bank b;
	
	public Card(String name, LocalDate ervenyes, int egyenleg, Bank b) {
		
		this.name = name;
		this.ervenyes = ervenyes;
		this.egyenleg = egyenleg;
		this.b = b;
	}

	public String getName() {
		return name;
	}

	public LocalDate getErvenyes() {
		return ervenyes;
	}

	public int getEgyenleg() {
		return egyenleg;
	}

	public Bank getB() {
		return b;
	}

	@Override
	public String toString() {
		return "Card [name=" + name + ", ervenyes=" + ervenyes + ", egyenleg=" + egyenleg + ", b=" + b + "]";
	}

	public void setEgyenleg(int egyenleg) {
		this.egyenleg = egyenleg;
	}
	
	public boolean penzfel(int osszeg)
	{
		if(getEgyenleg()-osszeg<0)
		{
			return false;
		}
		else if(getErvenyes().isBefore(LocalDate.now()))
		{
			return false;
			
		}
		else {
			this.setEgyenleg(getEgyenleg()-osszeg);
			
			return true;
			} 
		
		
	}
	
	
}
