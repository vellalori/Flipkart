package testPage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.TestBase;

public class MainPage  extends TestBase{
	//object repository  
@FindBy(xpath="//div[contains(text(),'Top Offers')]")
WebElement TopOffers;
@FindBy(xpath="//div[contains(text(),'Grocery')]")
WebElement Grocery;
@FindBy(xpath="//div[contains(text(),'Mobiles')]")
WebElement Mobiles;
@FindBy(xpath="//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[4]")
WebElement Fashion;
@FindBy(xpath="//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[5]/a[1]/div[2]/div[1]/div[1]")
WebElement Electronics;
@FindBy(xpath="//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[6]/a[1]/div[2]/div[1]/div[1]")
WebElement Home;
@FindBy(xpath="//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[7]/a[1]/div[2]/div[1]/div[1]")
WebElement Appliances;
@FindBy(xpath="//div[contains(text(),'Travel')]")
WebElement Travel;
@FindBy(xpath="//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[9]/a[1]/div[2]/div[1]/div[1]")
WebElement Beautyandkids;
@FindBy(name="q")
WebElement searchbar;
@FindBy(xpath="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*[1]")
WebElement clickbutton;
@FindBy(xpath = "//div[contains(text(),'Beauty, Toys & More')]")
WebElement Beauty;
@FindBy(xpath = "//a[contains(text(),'Toys & School Supplies')]")
WebElement Toys;
@FindBy(xpath = "//a[contains(text(),'Remote Control Toys')]")
WebElement Remotecar;

@FindBy(xpath = "//a[contains(text(),'Yug Fashion BACKGAMMON Remote Control Rock Crawler (4WD...')]")
WebElement viewToy;
@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
WebElement AddToyToCart;
@FindBy(xpath = "//div[contains(text(),'Price -- High to Low')]")
WebElement SortBy;
@FindBy(xpath = "//div[contains(text(),'Popularity')]")
WebElement Popularity;

@FindBy(xpath="//div[contains(text(),'Raghava Sai')]")
WebElement name;
@FindBy(xpath="//div[contains(text(),'Logout')]")
WebElement logout;
//initilaise OR
public MainPage()
{
	PageFactory.initElements(driver,this);
}
//Actions

public void click() {
	Actions action=new Actions(driver);
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(TopOffers));
			
	action.moveToElement(TopOffers).click().build().perform();

	
}
public void move()
{Actions action=new Actions(driver);
WebDriverWait wait=new WebDriverWait(driver,10);
wait.until(ExpectedConditions.visibilityOf(Electronics));
action.moveToElement(Electronics).build().perform();
}
public void search() {
	Actions action=new Actions(driver);
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(searchbar));
			action.sendKeys(searchbar,"realme7"+Keys.ENTER).build().perform();
			//action.moveToElement(click).click().build().perform();
			//clickbutton.click();
}
public void travel()
{
	Actions action=new Actions(driver);
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(Travel));
	action.moveToElement(Travel).click().build().perform();
	//driver.navigate().back();
}


public WebElement ToysAndBeauty() throws InterruptedException {



    Actions action = new Actions(driver);
    action.moveToElement(Beauty).build().perform();
    action.moveToElement(Toys).build().perform();
    action.moveToElement(Remotecar).click().build().perform();
    Thread.sleep(5000);
    Popularity.click();
    Thread.sleep(5000);
    viewToy.click();
    // It will return the parent window name as a String
    String parent = driver.getWindowHandle();



    Set<String> s = driver.getWindowHandles();



    // Now iterate using Iterator
    Iterator<String> I1 = s.iterator();



    while (I1.hasNext()) {



        String child_window = I1.next();



        if (!parent.equals(child_window)) {
            driver.switchTo().window(child_window);
            AddToyToCart.click();
            Thread.sleep(5000);



            System.out.println(driver.switchTo().window(child_window).getTitle());



            driver.close();
        }



    }
    // switch to the parent window
    driver.switchTo().window(parent);
    return AddToyToCart;
}



public WebElement Sortby() {



    Actions action = new Actions(driver);
    action.moveToElement(Beauty).build().perform();
    action.moveToElement(Toys).build().perform();
    action.moveToElement(Remotecar).click().build().perform();
    SortBy.click();
    return SortBy;
}

public WebElement Logout() throws InterruptedException {
    Actions action = new Actions(driver);
    action.moveToElement(logout).click().build().perform();
    logout.click();
    return logout;

}



}

















	
	