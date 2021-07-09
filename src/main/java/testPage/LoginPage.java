package testPage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class LoginPage extends TestBase {
	//object repository
	  @FindBy(xpath="//a[contains(text(),'Login')]")
WebElement login;
@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
WebElement Email_or_phone;
@FindBy(xpath="//input[@type='password' and @class='_2IX_2- _3mctLh VJZDxU']")
WebElement password;
@FindBy(xpath="//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL']")
WebElement Login;
//initilaise OR
public LoginPage()
{
	PageFactory.initElements(driver,this);
}
//Actions
public void login() {
 
	Actions action=new Actions(driver);
	action.moveToElement(login).sendKeys(prop.getProperty("Email")).build().perform();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);",password);
	password.click();
	password.sendKeys(prop.getProperty("password"));
	Login.click();
}
 public void invalidLogin()
 {
	 Actions action=new Actions(driver);
		action.moveToElement(login).sendKeys(prop.getProperty("Mobile")).build().perform();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",password);
		password.click();
		password.sendKeys(prop.getProperty("password"));
		Login.click(); 
 }
 }
	
	

  