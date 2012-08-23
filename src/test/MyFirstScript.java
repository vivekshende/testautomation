package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyFirstScript {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/vishende/work/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();

//		WebDriver driver = new HtmlUnitDriver();
//		WebDriver driver = new FirefoxDriver();

		
//		driver.get("http://mail.google.com");
		driver.get("http://www.facebook.com");
//		WebElement username = driver.findElement(By.id("Email"));
//		username.sendKeys("vivek.shende");
//		WebElement password = driver.findElement(By.id("Passwd"));
//		password.sendKeys("xyz");
		driver.findElement(By.linkText("Data Use Policy")).click();
//		driver.navigate().to("http://www.google.com");
//		System.out.println(driver.getPageSource());
		
//		driver.switchTo().window("")
	}

}
