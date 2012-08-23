package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Ebay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/vishende/work/selenium/chromedriver");
//		WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("http://www.ebay.in/");
		List<WebElement> browseCats = driver.findElements(By.className("catContent"));
	
		for (WebElement cat: browseCats){
			System.out.println(cat.getText());
			}
		System.out.println("printed1");
		driver.close();

		
		WebElement cats = driver.findElement(By.xpath(".//tr[child::td[@class='catContent']]"));
		System.out.println(cats.getText());
		System.out.println("printed2");
		
		WebElement cats2 = driver.findElement(By.cssSelector(".r3_cm.po"));
		WebElement cats3 = cats2.findElement(By.tagName("table"));
		System.out.println(cats3.getText());
		System.out.println("printed3");
		
		
	}

}
