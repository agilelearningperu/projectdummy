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
    private static String path = "src\\test\\resources\\Files\\";

    public static void escribirCSV(String name_file) throws IOException {
        String File = path+name_file+".csv";
        try (
                BufferedWriter writer = Files.newBufferedWriter(Paths.get(File));
                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("Nro Tarjeta", "CVV", "Mes", "Año"));
        ){
            csvPrinter.printRecord();
        }
    }

    public static void leerCSV(String name_file) throws IOException{
        String File = path+name_file+".csv";
        try (
                Reader reader = Files.newBufferedReader(Paths.get(File));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withHeader("Nro Tarjeta", "CVV", "Mes", "Año")
                        .withIgnoreHeaderCase()
                        .withTrim());
        ) {
            for (CSVRecord csvRecord : csvParser) {
               /* TarjetaPage.tarjeta = csvRecord.get("Nro Tarjeta");
                TarjetaPage.cvv = csvRecord.get("CVV");
                TarjetaPage.mes = csvRecord.get("Mes");
                TarjetaPage.anio = csvRecord.get("Año");*/
            }
        }
    }
}
