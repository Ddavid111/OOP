package mypackage;

public interface Értékesíthetõ {
	static int alapertelmezett_ar = 1;
	static String alapertelmezett_devizanem = "Ft";
	
	String getAr();
	void setAr(int ar, String devizanem);
}