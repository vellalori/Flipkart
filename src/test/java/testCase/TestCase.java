package testCase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testBase.TestBase;
import testPage.LoginPage;
import testPage.MainPage;

public class TestCase extends TestBase {
	LoginPage loginpage;
	MainPage mp;
	public TestCase()
	{
		super();
		
	}
	@BeforeMethod
	public void SetUp() {
		Initialisation();
		loginpage=new LoginPage();
		mp=new MainPage();
}
	@AfterMethod
	public void TearDown() 
	{
		
//driver.quit();
	}
	@Test(priority=1,enabled=false)
		public void Launch() {
		driver.get(prop.getProperty("url"));
	 System.out.println("launch successful");
	}
	@Test(priority=2,enabled=false)
	public void ImageVerify() {
		driver.get(prop.getProperty("url"));
		boolean b=driver.findElement(By.xpath("//img[@title='Flipkart']")).isDisplayed();
		Assert.assertTrue(b);
		System.out.println(b);
 System.out.println("image verification successful");
}
	@Test(priority=3,enabled=false)
	public void Launch2() {
		driver.get(prop.getProperty("url1"));
		 System.out.println("launch unsuccessful");
}
	@Test(priority=4,enabled=false)
	public void LinksVerify() {
		driver.get(prop.getProperty("url"));
		boolean b=driver.findElement(By.xpath("//*[text()='Top Offers']")).isDisplayed();
		Assert.assertTrue(b);
		System.out.println(b);
 System.out.println("links verification successful");
     boolean b1=driver.findElement(By.xpath("//input[@name='q']")).isDisplayed();
		Assert.assertTrue(b1);
		System.out.println(b1);
 System.out.println("textbox verification successful");
 
}
     @Test(priority=5,enabled=false)
          public void login()
          {
        	  driver.get(prop.getProperty("url"));
              loginpage.login();
          }
     @Test(priority=6,enabled=false)
     public void invalidlogin()
     {
   	  driver.get(prop.getProperty("url"));
         loginpage.invalidLogin();
        
     }   
       
    @Test(priority=7,enabled=false)
     public void verifyclick()
     {
   	  driver.get(prop.getProperty("url"));
   	  loginpage.login();
   mp.click();
 	
     }
    
    @Test(priority=8,enabled=false)
     public void verifyNavigate()
     {
   	  driver.get(prop.getProperty("url"));
   	  loginpage.login();
   	mp.move();
 	System.out.println("Electronics highlighted");
     }
    @Test(priority=9,enabled=false)
    public void verifySearch()
    {
  	  driver.get(prop.getProperty("url"));
  	  loginpage.login();
  	mp.search();
  	System.out.println("search done");
}
   /* @Test(priority=11,enabled=false)
    public void babysearch()
    {
  	  driver.get(prop.getProperty("url"));
  	  loginpage.login();
  	  mp.babysearch();
  
}*/
    @Test(priority=10,enabled=false)
    public void flightsearch()
    {
  	  driver.get(prop.getProperty("url"));
  	  loginpage.login();
  	  mp.travel();
  	driver.navigate().back();
  
}
    @Test(priority=13,enabled=true)
   
    public void Toys() throws InterruptedException {
    	 driver.get(prop.getProperty("url"));
     	  loginpage.login();
        Thread.sleep(1000);
        mp.ToysAndBeauty();
       
        Thread.sleep(10000);
       
    }
  
    @Test(priority=12,enabled=true)
    public void Sortby() throws InterruptedException {
    	 driver.get(prop.getProperty("url"));
    	  loginpage.login();
        Thread.sleep(1000);
        mp.Sortby();
       
 
}
   
    @Test(enabled=true,priority=14)
    public void LogOut() throws InterruptedException {
    	 driver.get(prop.getProperty("url"));
    	  loginpage.login();
        Thread.sleep(1000);
        mp.Logout();
   
    }
   
 
}
  