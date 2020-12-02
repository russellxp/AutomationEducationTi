package Pruebas;

import org.testng.Assert;
import org.testng.annotations.*;

import Paginas.paginaInicio;
import Paginas.paginaLogin;
import Utilidades.DatosExcel;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class Test_Laboratorio4_E2 {
	WebDriver driver;
	String driverPath = "Drivers/chromedriver.exe";
	String urlTest ="http://automationpractice.com/index.php";
	
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver = new ChromeDriver();
		driver.get(urlTest);
		
	}
	
	
	@Test(dataProvider="datos login invalido")
	public void crearCuentaInvalida(String emailAddress, String password) throws IOException {
		paginaInicio inicio = new paginaInicio(driver);
		inicio.clicOnSingIn();
		
		paginaLogin login = new paginaLogin(driver);
		login.writeCredentials(emailAddress, password);
		
		String tituloActual = login.getTextTitleForm();
				
		Assert.assertEquals(tituloActual, "AUTHENTICATION");	
		
	
		
	}
	
	@AfterSuite
	public void cierre() {
		driver.close();
		
	}
	
	@DataProvider(name="datos login invalido")
	public Object[][] getData() throws Exception{
		
		Object[][] datos = DatosExcel.leerExcel("Datos/datosLab4_E2.xlsx", "Hoja1");
		
		return datos;
	}

}
