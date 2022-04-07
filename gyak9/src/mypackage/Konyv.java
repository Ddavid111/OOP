package mypackage;

import java.time.LocalDate;

public class Konyv extends Aru {
	private String cim;
	private String szerzo;
	
	private final int megjelenes_eve;
	private int oldalszam;
	
	private static String kiado = "Móra Kiado";

	public Konyv(String cim, String szerzo, int ar, int oldalszam) {
		super("konyv", ar, 27);
		this.cim = cim;
		this.szerzo = szerzo;
		this.megjelenes_eve = LocalDate.now().getYear();
		this.oldalszam = oldalszam;
	}

	public Konyv(String cim, String szerzo, int oldalszam) {
		this(cim, szerzo, 2500, oldalszam);
	}	
	
	@Override
	public String toString() {
		return szerzo + ": " + cim + " (" + kiado + ", " + megjelenes_eve + ", " + oldalszam+ " oldal "+ getAr()+ ")";
	}

	public String getCim() {
		return cim;
	}

	public String getSzerzo() {
		return szerzo;
	}

	public int getMegjelenes_eve() {
		return megjelenes_eve;
	}
	
	
	public boolean cimEgyezikE(Konyv masikKonyv) {
		return cim.equals(masikKonyv.cim);
	}
	

	public static Konyv hosszabbKonyv(Konyv egyik_konyv, Konyv masik_konyv) {
		if (egyik_konyv.oldalszam > masik_konyv.oldalszam) {
			return egyik_konyv;
		} else {
			return masik_konyv;
		}
	}
	
	
	public boolean oldalszamParosE() {
		return oldalszam % 2 == 0;
	}
	
	
	}
