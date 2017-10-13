package core;
import org.openqa.selenium.WebDriver;
public class Main {
	static WebDriver driver;
public static void main (String [] args) {
	LogIn b = new LogIn();
	b.login("https://www.yelp.com/nyc", driver);
	
	
	
	
}
	
	
	
	
	
}
