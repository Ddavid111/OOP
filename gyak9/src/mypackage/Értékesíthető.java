package mypackage;

public interface Értékesíthető {
	static int alapertelmezett_ar = 1;
	static String alapertelmezett_devizanem = "Ft";
	
	String getAr();
	void setAr(int ar, String devizanem);
}