package Edit.EduacionIt;
import org.testng.annotations.Test;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laboratorio1 {

		@Test
		public void lab1_E1() {
			
			//Configurando las propiedades del driver
		//	System.setProperty("webdriver.chrome.driver", "..\\EduationIt\\Drivers\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		//	driver = new ChromeDriver();
			
			WebDriver driver = new ChromeDriver();
			
			driver.close();
			
		}
		
		
		@Test
		public void lab1_E2() {
			
			//Configurando las propiedades del driver
		//	System.setProperty("webdriver.chrome.driver", "..\\EduationIt\\Drivers\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		//	driver = new ChromeDriver();
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://selenium.dev/");
			driver.manage().window().maximize();
			
			
			driver.close();
			
		}
}
