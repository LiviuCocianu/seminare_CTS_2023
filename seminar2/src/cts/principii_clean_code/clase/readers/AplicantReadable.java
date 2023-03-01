package cts.principii_clean_code.clase.readers;

import cts.principii_clean_code.clase.Aplicant;

import java.util.List;

public interface AplicantReadable {
    List<Aplicant> readAplicants(String fileName);
}
