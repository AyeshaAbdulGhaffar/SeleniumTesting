import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Ayesha");
		driver.findElement(By.name("email")).sendKeys("ayesha@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("ayesha");
		driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		driver.findElement(By.xpath("//option[normalize-space()='Female']")).click();
		driver.findElement(By.cssSelector("input[id='inlineRadio1']")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("08252000");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());

	}

}
