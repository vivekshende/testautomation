package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/vishende/work/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://mail.google.com");
		WebElement username = driver.findElement(By.xpath(".//*[@id='Email']"));
		WebElement password = driver.findElement(By.xpath(".//*[@id='Passwd']"));
		username.sendKeys("Vivek");
		password.sendKeys("pwd");
		WebElement signIn = driver.findElement(By.xpath(".//*[@id='signIn']"));
		signIn.submit();

	}
}
