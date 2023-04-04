package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Launch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashant\\Desktop\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		
		
		opt.addArguments("--remote-allow-origins=*");

		
		WebDriver driver= new ChromeDriver(opt);

		driver.get("https://www.google.com");

	}
}
