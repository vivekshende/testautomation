package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DestQATutorial1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/vishende/work/selenium/chromedriver");
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();

		driver.get("http://destinationqa.com/aut/RadioButtons.html");
		WebElement checkBoxDay = driver.findElement(By.cssSelector("input[value='Mon']"));
		checkBoxDay.click();
		
		WebElement checkBoxColor = driver.findElement(By.xpath(".//*[@id='colors']/input[@name='red']"));
		checkBoxColor.click();
		checkBoxColor = driver.findElement(By.xpath(".//*[@id='colors']/input[@name='orange']"));
		checkBoxColor.click();
		checkBoxColor = driver.findElement(By.xpath(".//*[@id='colors']/input[@name='yellow']"));
		checkBoxColor.click();
	}
}
