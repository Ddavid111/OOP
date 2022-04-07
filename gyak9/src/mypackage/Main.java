package mypackage;

public class Main {
	public static void main(String[] args) {
		int euroarfolyam = 311;
		Értékesíthetõ ingatlan = new Ingatlan(500000, "Ft", 50, "Miskolc");

		System.out.println(ingatlan);
		((Ingatlan)ingatlan).atvaltEurora(euroarfolyam);;
		System.out.println(ingatlan);

		Értékesíthetõ konyv = new Konyv("Cim", "Szerzo", 3500, 250);
		System.out.println(konyv);
		konyv.setAr(((Aru)konyv).brutto_ar() / euroarfolyam, "EUR");
		System.out.println(konyv);
	}
	
}