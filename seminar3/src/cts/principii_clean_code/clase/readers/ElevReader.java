package cts.principii_clean_code.clase.readers;

import cts.principii_clean_code.clase.Aplicant;
import cts.principii_clean_code.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReadable {

    @Override
    public List<Aplicant> readAplicants(String fileName) {
        List<Aplicant> elevi = new ArrayList<>();

        try {
            Scanner input2 = new Scanner(new File(fileName));
            input2.useDelimiter(",|\n");

            while (input2.hasNext()) {
                Elev elev = new Elev();

                super.readAplicant(input2, elev);
                elev.setClasa(input2.nextInt());
                elev.setTutore(input2.next());

                elevi.add(elev);
            }

            input2.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        return elevi;
    }
}
