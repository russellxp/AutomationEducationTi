package Pruebas;

import org.testng.Assert;
import org.testng.annotations.*;

import Paginas.paginaInicio;
import Paginas.paginaLogin;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class Test_Labotarotio4_E1 {
	
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
	public Object[][] getData() {
		Object[][] datos = new Object[2][2];
		
		datos[0][0] = "correo0001@correo.com";
		datos[0][1] = "0452ss";		
		datos[1][0] = "correo0002@correo.com";
		datos[1][1] = "04zxcxc52ss";	
		
		return datos;
	}

}
