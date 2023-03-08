package cts.principii_clean_code.main;

import java.util.List;

import cts.principii_clean_code.clase.Aplicant;
import cts.principii_clean_code.clase.readers.AngajatReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;

		AngajatReader ar = new AngajatReader();
		listaAngajati = ar.readAplicants("angajati.txt");

		for (Aplicant aplicant : listaAngajati) {
			System.out.println(aplicant.toString());
			aplicant.afisareFinantare();
		}
	}
}
