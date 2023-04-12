package com.baseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

	protected static WebDriver driver;
	protected static Properties prop;
	
	public BaseClass()
	{
		prop =new Properties();
		
		try {
			FileInputStream fis= 
					new FileInputStream("E:\\Testing_Auto\\gmail\\src\\main\\java\\com\\configLayer\\File.properties");
					prop.load(fis);
		
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prashant\\Desktop\\chromedriver.exe");
	
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&osid=1&passive=1209600&service=mail&ifkv=AQMjQ7To-M5OJyNremXg8KmqKWhpURYiuJDrvoSM3ZzCwO_VjA63vTwPZ40s1qrYJtD9JcR9scP4Lg&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
		
	}
	
	public static void tearDown()
	{
		driver.close();
	}
	
}
