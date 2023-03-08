package cts.principii_clean_code.clase;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	private static final int sumaFinantare = 20;

	public Student() {
		super();
	}

	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.an_studii = an_studii;
	}

	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public int getAn_studii() {
		return an_studii;
	}
	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}

	@Override
	public void afisareFinantare() {
		super.afisareFinantare("Student", Student.sumaFinantare);
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Student{");
		sb.append(super.toString());
		sb.append(", facultate='").append(facultate).append('\'');
		sb.append(", an_studii=").append(an_studii);
		sb.append('}');
		return sb.toString();
	}
}
