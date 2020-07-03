package test;

import org.junit.Test;
import pageobjects.formularioPage;

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
        formulario.escribirEmail("Lima");
        formulario.escribirEmail("aavila@yopmail.com");
        formulario.seleccionarGenero("masculino");
        formulario.seleccionarDias("Monday,Friday,Saturday");
        formulario.seleccionarTiempo("Afternoon");
        formulario.ingresarArchivo("/Users/saris/Desktop/ALEXANDER/R2D2.jpg");
        formulario.clickSubmit();
    }

    @Test
    public void cargarDataTest(){
        driver.get("http://testautomationpractice.blogspot.com/");
        formulario.iframe();
        formulario.escribirNombre("Alexander");
        formulario.escribirApellido("Avila");
        formulario.escribirTelefono("123456789");
        formulario.escribirPais("Perú");
        formulario.escribirEmail("Lima");
        formulario.escribirEmail("aavila@yopmail.com");
        formulario.seleccionarGenero("masculino");
        formulario.seleccionarDias("Monday,Friday,Saturday");
        formulario.seleccionarTiempo("Afternoon");
        formulario.ingresarArchivo("/Users/saris/Desktop/ALEXANDER/R2D2.jpg");
        formulario.clickSubmit();
    }
}
