package test;

import org.junit.Test;
import pageobjects.formularioPage;
import pageobjects.lateralPage;
import support.filecsv;
import support.frameworkBase;

import java.io.IOException;

import static support.evidencia.screenshot;

public class formularioTest extends hooks{
formularioPage formulario;
lateralPage lateral;

    public formularioTest() {
        formulario = new formularioPage();
        lateral = new lateralPage();
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
        formulario.ingresarArchivo("D:\\ALP - Agile Learning Perú\\Cursos\\Proyectos\\projectdummy\\src\\test\\resources\\data\\dataTest1.csv");
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
        screenshot();
        formulario.clickSubmit();
    }

    @Test
    public void TestAlert(){
        driver.get("http://testautomationpractice.blogspot.com/");
        lateral.clickAlert();
        lateral.aceptarAlerta();
        lateral.validarMensaje("You pressed OK!");
    }
}
