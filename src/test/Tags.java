package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tags {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/vishende/work/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://maps.google.com");
		WebElement query = driver.findElement(By.id("gbqfq"));
		query.sendKeys("Nagpur, India");
		WebElement button = driver.findElement(By.tagName("button"));
		button.submit();

	}

}
