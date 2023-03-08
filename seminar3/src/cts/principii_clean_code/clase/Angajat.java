package cts.principii_clean_code.clase;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static final int sumaFinantare = 10;

	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
	}

	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	@Override
	public void afisareFinantare() {
		super.afisareFinantare("Angajat", Angajat.sumaFinantare);
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Angajat{");
		sb.append(super.toString());
		sb.append(", ocupatie='").append(ocupatie).append('\'');
		sb.append(", salariu=").append(salariu);
		sb.append('}');
		return sb.toString();
	}
}
