package Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class paginaLogin {
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='email_create']")
	WebElement txtEmailAdress;
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	WebElement btnCreateAccount;
	
	@FindBy(xpath="//h1[contains(text(),'Authentication')]")
	WebElement title;
	
	@FindBy(css="#email")
	WebElement txtEMail;
	

	@FindBy(css="#passwd")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement btnSingIn;
	
	public paginaLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory (driver,20), this);
	}
	
	
	public void writeEmailAddress(String emailAddres) {
		txtEmailAdress.sendKeys(emailAddres);
		
	}
	
	public void clicOnCreateAccount() {
		btnCreateAccount.click();
		
	}
	
	public String getTextTitleForm() {
		return title.getText();
		
	}
	
	public void writeCredentials(String emailAddress, String password) {
		txtEMail.sendKeys(emailAddress);
		txtPassword.sendKeys(password);
		
	}
	
	public void clicOnSignIn() {
		btnSingIn.click();
		
	}
}

