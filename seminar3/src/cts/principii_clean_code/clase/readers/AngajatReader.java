package cts.principii_clean_code.clase.readers;

import cts.principii_clean_code.clase.Angajat;
import cts.principii_clean_code.clase.Aplicant;
import cts.principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReadable {

    @Override
    public List<Aplicant> readAplicants(String fileName) {
        List<Aplicant> angajati = new ArrayList<>();

        try {
            Scanner input2 = new Scanner(new File(fileName));
            input2.useDelimiter(",");

            while (input2.hasNext()) {
                Angajat angajat = new Angajat();

                super.readAplicant(input2, angajat);
                angajat.setSalariu(input2.nextInt());
                angajat.setOcupatie(input2.next());

                angajati.add(angajat);
            }
            input2.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        return angajati;
    }
}
