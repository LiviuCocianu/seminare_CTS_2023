package cts.principii_clean_code.clase.readers;

import cts.principii_clean_code.clase.Aplicant;
import cts.principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReadable {
    @Override
    public List<Aplicant> readAplicants(String fileName) {
        List<Aplicant> studenti = new ArrayList<>();

        try {
            Scanner input = new Scanner(new File(fileName));
            input.useDelimiter(",|\n");

            while (input.hasNext()) {
                Student student = new Student();

                super.readAplicant(input, student);
                student.setAn_studii(input.nextInt());
                student.setFacultate(input.next());

                studenti.add(student);
            }
            input.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        return studenti;
    }
}
