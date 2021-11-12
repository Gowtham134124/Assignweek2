package createNew;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Gowtham");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Dev");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("gowthamdev01996@gmail.com");
		WebElement jobtit = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select job = new Select(jobtit);
		job.selectByVisibleText("Operations Manager");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("wipro");
		WebElement Employee = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select emp = new Select(Employee);
		emp.selectByIndex(1);
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("739745120");
		WebElement countryname = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select cntry = new Select(countryname);
		cntry.selectByValue("AL");
		 driver.findElement(By.xpath("//div[@class='sr-only']/following-sibling::div")).click();
	}

}
