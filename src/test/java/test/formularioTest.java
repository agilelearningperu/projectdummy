package test;

import org.junit.Test;
import pageobjects.formularioPage;
import support.filecsv;

import java.io.IOException;

public class formularioTest extends hooks{
formularioPage formulario;

    public formularioTest() {
        formulario = new formularioPage();
    }

    @Test
    public void primerTest(){
        driver.get("http://testautomationpractice.blogspot.com/");
        formulario.iframe();
        formulario.escribirNombre("Alexander");
        formulario.escribirApellido("Avila");
        formulario.escribirTelefono("123456789");
        formulario.escribirPais("Perú");
        formulario.escribirCiudad("Lima");
        formulario.escribirEmail("aavila@yopmail.com");
        formulario.seleccionarGenero("masculino");
        formulario.seleccionarDias("Monday,Friday,Saturday");
        formulario.seleccionarTiempo("Afternoon");
        formulario.ingresarArchivo("/Users/saris/Desktop/ALEXANDER/R2D2.jpg");
        formulario.clickSubmit();
    }

    @Test
    public void cargarDataTest() throws IOException {
        driver.get("http://testautomationpractice.blogspot.com/");
        filecsv.leerCSV("dataTest1");
        formulario.iframe("frame-one1434677811");
        formulario.escribirNombre(filecsv.nombre);
        formulario.escribirApellido(filecsv.apellido);
        formulario.escribirTelefono(filecsv.telefono);
        formulario.escribirPais(filecsv.pais);
        formulario.escribirCiudad(filecsv.ciudad);
        formulario.escribirEmail(filecsv.email);
        formulario.seleccionarGenero(filecsv.genero);
        formulario.seleccionarDias(filecsv.dias);
        formulario.seleccionarTiempo(filecsv.tiempo);
        formulario.ingresarArchivo(filecsv.archivo);
        formulario.clickSubmit();
    }
}
