package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/vishende/work/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://mail.google.com");
		WebElement username = driver.findElement(By.cssSelector("#Email"));
		WebElement password = driver.findElement(By.cssSelector("#Passwd"));
		username.sendKeys("Vivek");
		password.sendKeys("pwd");
		WebElement signIn = driver.findElement(By.cssSelector("#signIn"));
		signIn.submit();

	}
}
