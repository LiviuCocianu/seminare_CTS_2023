package cts.principii_clean_code.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nr_proiecte;
	protected String[] denumireProiect;
	protected static int pragPunctaj = 80;

	public Aplicant() {
		super();
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nr_proiecte = nr_proiecte;
		this.denumireProiect = denumireProiect;
	}

	public String getNume() {
		return this.nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return this.prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return this.varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void afisareStatus() {
		String verdict = this.punctaj > Aplicant.pragPunctaj ? "" : " nu";
		System.out.println("Aplicantul " + this.nume + " " + this.prenume + verdict + " a fost acceptat.");
	}

	public int getPunctaj() {
		return this.punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public int getNr_proiecte() {
		return nr_proiecte;
	}
	public void setNr_proiecte(int nr_proiecte, String[] denumireProiect) {
		this.nr_proiecte = nr_proiecte;
		this.denumireProiect = new String[this.nr_proiecte];

		for(int i = 0; i < this.nr_proiecte; i++) {
			this.denumireProiect[i] = denumireProiect[i];
		}
	}

	public abstract void afisareFinantare();

	protected void afisareFinantare(String tipAplicant, int sumaFinantare) {
		System.out.println(tipAplicant + " " + this.nume + " " + this.prenume + " primeste " + sumaFinantare + " Euro/zi in proiect.");
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer();
		sb.append("nume='").append(nume).append('\'');
		sb.append(", prenume='").append(prenume).append('\'');
		sb.append(", varsta=").append(varsta);
		sb.append(", punctaj=").append(punctaj);
		sb.append(", nr_proiecte=").append(nr_proiecte);
		sb.append(", denumireProiect=").append(denumireProiect == null ? "null" : Arrays.asList(denumireProiect).toString());
		return sb.toString();
	}
}
