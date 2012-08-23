package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Flipkart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/vishende/work/selenium/chromedriver");
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new HtmlUnitDriver();

		driver.get("http://www.flipkart.com/");
		WebElement searchBox = driver.findElement(By.xpath(".//*[@id='fk-top-search-box']"));
		searchBox.sendKeys("da vi");
		
		System.out.println("printing");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement res = driver.findElement(By.cssSelector(".fk-ac-results"));
		System.out.println(res.getText());
		System.out.println("printed");
//		WebElement searchBtn = driver.findElement(By.cssSelector(".fk-main-search-btn"));
//		checkBoxDay.click();
		driver.close();
	}

}
