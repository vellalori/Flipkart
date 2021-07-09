package testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public TestBase() {
		try {
			prop=new Properties();
	FileInputStream ip=new FileInputStream("F:\\eclipse05\\Flipkart\\src\\main\\java\\configproperties\\config.properties");
	prop.load(ip);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e1) {
		e1.printStackTrace();
	}
	}
		public static void Initialisation() {
			String browsername=prop.getProperty("browser");
			if(browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","F:\\eclipse05\\build files\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
			
			}
		}
			 
}
		
