package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;

public class Login_Page {
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chromedriver","C:\\Users\\fouri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staging.fytrack.com/#/login");
		WebElement drop = driver.findElement(By.xpath("//div[@class=\"mat-select-arrow-wrapper ng-tns-c203-5\"]"));
		drop.click();
 driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();
 driver.findElement(By.xpath("(//input[@name=\"username\"])[2]")).sendKeys("info@4ibiz.in");
 driver.findElement(By.xpath("(//input[@name=\"password\"])[2]")).sendKeys("Newpass@21");
 driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
}
}