package Pruebas;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Paginas.paginaInicio;
import Paginas.paginaLogin;

public class Laboratorio3_E2 {
	WebDriver driver;
	String driverPath = "Drivers/chromedriver.exe";
	String urlTest ="http://automationpractice.com/index.php";
	
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver = new ChromeDriver();
		driver.get(urlTest);
		
	}
	
	@Test
	public void irRegistroLogin() {
		paginaInicio inicio = new paginaInicio(driver);
		inicio.clicOnSingIn();
		
		paginaLogin login = new paginaLogin(driver);
		
		
		Assert.assertEquals(login.getTextTitleForm(), "AUTHENTICATION");
				
	}
	
	@Test
	public void crearCuentaInvalida() throws IOException {
		paginaInicio inicio = new paginaInicio(driver);
		inicio.clicOnSingIn();
		
		paginaLogin login = new paginaLogin(driver);
		login.writeEmailAddress("elcorreoausar@gmail.com");
		login.clicOnCreateAccount();
		String tituloActual = login.getTextTitleForm();
				
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen,new File("Evidencias\\Test.png"));
		
		Assert.assertEquals(tituloActual, "AUTHENTICATION");	
		

		
	}
	
	@AfterTest
	public void cerra() {
		driver.close();
	}
}
