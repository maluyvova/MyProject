


package core;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
public class LogIn {
	static WebDriver driver;
   public static void login (String url, WebDriver driver) {
	   String email = "";
	   String password="";
	   Case cas = new Case();
	  
	   cas.openSafari(url);
	  //String Title =driver.getTitle();
   // System.out.println(Title);
    
       driver.findElement(By.xpath("//*[@id=\"talk\"]/a")).click();
       driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
       driver.findElement(By.id("first_name")).sendKeys("Vova");
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       driver.findElement(By.id("last_name")).sendKeys("burian");
       driver.findElement(By.id("email")).sendKeys(email);
       driver.findElement(By.id("password")).sendKeys(password);
       driver.findElement(By.id("zip")).sendKeys("95661");
       driver.findElement(By.id("birthdate")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[1]/div/div/div[1]/div[1]/form/div[2]/fieldset/ul/li[1]/select/option[4]")).click();
	 
	   
	   
	   
	   
   }
}
