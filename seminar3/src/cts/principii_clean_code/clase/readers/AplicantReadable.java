package cts.principii_clean_code.clase.readers;

import cts.principii_clean_code.clase.Aplicant;

import java.util.List;
import java.util.Scanner;

public abstract class AplicantReadable {
    public abstract List<Aplicant> readAplicants(String fileName);
    public void readAplicant(Scanner input, Aplicant aplicant) {
        String nume = input.next();
        String prenume = (input.next());
        int varsta = Integer.valueOf(input.nextInt());
        int punctaj = Integer.valueOf(input.nextInt());
        int nr = Integer.valueOf(input.nextInt());
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();

        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNr_proiecte(nr, vect);
    }
}
