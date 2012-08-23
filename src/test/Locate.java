package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/vishende/work/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");
		WebElement query = driver.findElement(By.name("q"));
		query.sendKeys("vivek.shende");
	
	}

}
