import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// Invoking browser
		//chrome - chromeDriver -> methods
		//Firefox - FirefoxDriver -> methods
		//WebDriver methods + class methods
		//chromedriver.exe -> chrome browser
		
		//webdriver.chrome.drive --> value of the path
		//for firefox webdriver.gecko.drive --> value of the path
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		//Microsoft edge
		//System.setProperty("webdriver.edge.driver","C:\\Eclipse\\WebDrivers\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();	
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close(); //selenium new version has some issue due to which receive "WARNING: Connection reset"
		driver.quit();

	}

}
