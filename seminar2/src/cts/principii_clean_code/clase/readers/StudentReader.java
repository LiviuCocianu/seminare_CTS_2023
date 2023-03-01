package cts.principii_clean_code.clase.readers;

import cts.principii_clean_code.clase.Aplicant;
import cts.principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader implements AplicantReadable {
    @Override
    public List<Aplicant> readAplicants(String fileName) {
        List<Aplicant> studenti = new ArrayList<>();

        try {
            Scanner input = new Scanner(new File(fileName));
            input.useDelimiter(",|\n");

            while (input.hasNext()) {
                String nume = input.next();
                String prenume = (input.next());
                int varsta = Integer.valueOf(input.nextInt());
                int punctaj = Integer.valueOf(input.nextInt());
                int nr = Integer.valueOf(input.nextInt());
                String[] vect = new String[5];
                for (int i = 0; i < nr; i++)
                    vect[i] = input.next();
                int an_studii = input.nextInt();
                String facultate = (input.next());
                Student s = new Student(nume, prenume, varsta, punctaj, nr, vect, facultate, an_studii);
                studenti.add(s);
            }
            input.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        return studenti;
    }
}
