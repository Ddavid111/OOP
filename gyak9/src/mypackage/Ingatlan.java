package mypackage;

public class Ingatlan implements Értékesíthetõ {

	private int ar;
	private String devizanem;
	private int meret;
	private String hely;

	public Ingatlan(int ar, String devizanem, int meret, String hely) {
		this.ar = ar;
		this.devizanem = devizanem;
		this.meret = meret;
		this.hely = hely;
	}

	public int negyzetmeterenkentiAr() {
		return ar / meret;
	}

	@Override
	public String toString() {
		return "Ingatlan [" + hely+ ", "+ meret + " m2, "+ getAr() + ", " + negyzetmeterenkentiAr()+ " "+ devizanem+ "/m2]";
	}

	public void atvaltEurora(int arfolyam) {
		setAr(ar / arfolyam, "EURO");
	}
	
	@Override
	public String getAr() {
		return ar + " " + devizanem;
	}

	@Override
	public void setAr(int ar, String devizanem) {
		this.ar = ar;
		this.devizanem = devizanem;
	}
}