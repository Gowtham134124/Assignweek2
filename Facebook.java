package createNew;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Gowtham");
		driver.findElement(By.name("lastname")).sendKeys("Dev");
		driver.findElement(By.name("reg_email__")).sendKeys("7397402916");
		driver.findElement(By.id("password_step_input")).sendKeys("Gowtham@134124");
		WebElement webmet = driver.findElement(By.id("day"));
		Select select = new Select(webmet);
		select.selectByVisibleText("8");
		WebElement month = driver.findElement(By.id("month"));
		Select mnt = new Select(month);
		mnt.selectByValue("1");
		WebElement year = driver.findElement(By.id("year"));
		Select yrs = new Select(year);
		yrs.selectByVisibleText("1996");
		driver.findElement(By.xpath("//label[text() = 'Male']/following-sibling::input")).click();
		
		
		
	}

}
