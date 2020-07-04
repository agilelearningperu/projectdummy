package support;

import java.io.BufferedWriter;
import java.io.IOException;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class filecsv {

    public static String nombre;
    public static String apellido;
    public static String telefono;
    public static String pais;
    public static String ciudad;
    public static String email;
    public static String genero;
    public static String dias;
    public static String tiempo;
    public static String archivo;

    private static String path = "src/test/resources/data/";

    public static void leerCSV(String name_file) throws IOException{
        String File = path+name_file+".csv";
        try (
                Reader reader = Files.newBufferedReader(Paths.get(File));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withHeader("Nombre","Apellido","Telefono","Pais","Ciudad","Email","Genero","Dias","Tiempo","Archivo")
                        .withIgnoreHeaderCase()
                        .withTrim());
        ) {
            for (CSVRecord csvRecord : csvParser) {
                nombre = csvRecord.get("Nombre");
                apellido = csvRecord.get("Apellido");
                telefono = csvRecord.get("Telefono");
                pais = csvRecord.get("Pais");
                ciudad = csvRecord.get("Ciudad");
                email = csvRecord.get("Email");
                genero = csvRecord.get("Genero");
                dias = csvRecord.get("Dias");
                tiempo = csvRecord.get("Tiempo");
                archivo = csvRecord.get("Archivo");
            }
        }
    }
}
