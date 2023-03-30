package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
System.setProperty("Webdriver.chromedriver","C:\\Users\\fouri\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
//driver.get("https://staging.fytrack.com/#/login");

	}

}
