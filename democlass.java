package Pragyan_Prabha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class democlass {

	public static void main(String[] args)   {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragyan Prabha\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		0);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("infopragyanprabha@gmail.com"); 
		
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("abc123");

		driver.quit();
	}

}