package Prog2.aufgabe21;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

public class Student {
    private final Integer matrikelNr;
    private final String vorname;
    private final String nachname;

    public Student(Integer matrikelNr, String vorname, String nachname) {
        this.matrikelNr = matrikelNr;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Integer getMatrikelNr() {
        return matrikelNr;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    @Override
    public String toString() {
        return vorname + " " + nachname + " (" + matrikelNr + ")";
    }

    public static void main(String[] args) {
        try {
        List<String> result = Files.readLines(new File("studenten.txt"), Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}