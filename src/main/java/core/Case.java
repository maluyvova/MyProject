package core;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.safari.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Case {
	static WebDriver driver;
    public static void openchrome (String url) {
    	Logger.getLogger("").setLevel(Level.OFF);
    	
    	String driverPath="";
    	if (System.getProperty("os.name").toUpperCase().contains("MAC")) driverPath="./resources/webdrivers/mac/geckodriver.sh";
    	else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS")) driverPath="";
    	System.setProperty("webdriver.chrome.driver", driverPath);
    	System.setProperty("web.driver.silentOutput", "true");
    	ChromeOptions option = new ChromeOptions();
    	option.addArguments("disable-infobars");
    	option.addArguments("--disable-notifications");
    	if (System.getProperty("os.name").toUpperCase().contains("MAC"))
    		option.addArguments("--start-maximaxed");
    	else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"));
    	driver = new ChromeDriver(option);
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    
    	driver.get(url);}
    
    
    
    
    	public static void openFireFox(String url) {
 
    		Logger logger = Logger.getLogger("");
    		logger.setLevel(Level.OFF);
    		String driverPath = "";
    		if (System.getProperty("os.name").toUpperCase().contains("MAC"))     driverPath = "";
    		else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS")) driverPath = "";
    		System.setProperty("webdriver.gecko.driver", driverPath);
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			WebDriverWait wait = new WebDriverWait (driver,15);
    		driver.get(url);}
    	
    	
    	
    	public static void openSafari(String url) {
    		Logger logger = Logger.getLogger("");
    		logger.setLevel(Level.OFF);
    		if (!System.getProperty("os.name").contains("Mac")) {throw new IllegalArgumentException("Safari is available only on Mac");}
    		driver = new SafariDriver();
    		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    		driver.manage().window().maximize();
    	
    		driver.get(url);}
    		
    		
    	
    	
    	
       public static void openHTMLUnit (String url){
    			Logger.getLogger("").setLevel(Level.OFF);
    		       WebDriver driver =new HtmlUnitDriver();
    			((HtmlUnitDriver) driver).setJavascriptEnabled(true);
    			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    			driver.manage().window().maximize();
    			WebDriverWait wait = new WebDriverWait(driver,15);
    			
    			driver.get(url);}
       public static void quite() {driver.quit();}
       
    		
    			
    			
    			
    			
    			
    			
    		}
    		
    		
    
    	
    	
    	
    	
    	
    	
    
	
	
	
	

