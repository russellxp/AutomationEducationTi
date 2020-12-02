package Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;



public class paginaInicio {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement lnkSignIng;
	
	public paginaInicio(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory (driver,20), this);
		
	}
	
	public void clicOnSingIn() {
		lnkSignIng.click();
		
		
	}

}
