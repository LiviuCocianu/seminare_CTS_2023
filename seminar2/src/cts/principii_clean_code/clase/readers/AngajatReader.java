package cts.principii_clean_code.clase.readers;

import cts.principii_clean_code.clase.Angajat;
import cts.principii_clean_code.clase.Aplicant;
import cts.principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader implements AplicantReadable {

    @Override
    public List<Aplicant> readAplicants(String fileName) {
        List<Aplicant> angajati = new ArrayList<>();

        try {
            Scanner input2 = new Scanner(new File(fileName));
            input2.useDelimiter(",");

            while (input2.hasNext()) {
                String nume = input2.next();
                String prenume = input2.next();
                int varsta = input2.nextInt();
                int punctaj = input2.nextInt();
                int nr = input2.nextInt();
                String[] vect = new String[5];
                for (int i = 0; i < nr; i++)
                    vect[i] = input2.next();
                int salariu = input2.nextInt();
                String ocupatie = input2.next();
                Angajat a = new Angajat(nume, prenume, varsta, punctaj, nr, vect, salariu, ocupatie);
                angajati.add(a);
            }
            input2.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        return angajati;
    }
}
