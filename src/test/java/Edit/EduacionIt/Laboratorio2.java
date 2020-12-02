package Edit.EduacionIt;

import org.testng.annotations.Test;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class Laboratorio2 {
	
	@Test
	public void lab2_E1(){
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication#account-creation");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//campo Email Address
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#email_create")));
		driver.findElement(By.cssSelector("#email_create")).sendKeys("correfgo@micorreo.pe");
		
		// boton create a  Acoount
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='SubmitCreate']")));
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		
		//Campo First Name
		wait.until(ExpectedConditions.elementToBeClickable(By.name("customer_firstname")));
		driver.findElement(By.name("customer_firstname")).sendKeys("Guido");

		//Campo Last Name
		wait.until(ExpectedConditions.elementToBeClickable(By.name("lastname")));
		driver.findElement(By.name("lastname")).sendKeys("Robles");
		
		//Campor Password
		wait.until(ExpectedConditions.elementToBeClickable(By.id("passwd")));
		driver.findElement(By.id("passwd")).sendKeys("123456");
		
		//Campo Date
		Select mes = new Select(driver.findElement(By.xpath("//select[@id='months']")));
		mes.selectByValue("4");
		
		// Campo Title
		driver.findElement(By.xpath("//*[contains(@id,'gender1')]")).click();


		//Telefono
				
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("943519059");		
		
		//zipCode
		driver.findElement(By.cssSelector("#postcode")).sendKeys("45454");	
		
		//Año
		Select anio = new Select(driver.findElement(By.id("years")));
		anio.selectByValue("1990");
		
		//Addres
		driver.findElement(By.cssSelector("#address1")).sendKeys("Capac yupanqui");;
		
		//City
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Lima");
		
		//Dia
		Select dia = new Select(driver.findElement(By.xpath("//select[@id='days']")));
		dia.selectByValue("27");
		
		
		//Estado
		Select estado = new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
		estado.selectByIndex(1);
		
		//System.out.println("Estado : ");
		//Campo Last Name
		wait.until(ExpectedConditions.elementToBeClickable(By.name("customer_lastname")));
		driver.findElement(By.name("customer_lastname")).sendKeys("Robles");
		
		// Campo Register
		driver.findElement(By.xpath("//*[text()='Register']")).click();
	}
}
