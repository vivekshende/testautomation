package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Flipcart2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/vishende/work/selenium/chromedriver");
		WebDriver driver = new FirefoxDriver();
		
//		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("http://www.flipkart.com");
		WebElement booksMenu = driver.findElement(By.cssSelector(".boldtext.fk-mh-navmenu-lable"));
//		WebElement booksMenu = driver.findElement(By.id("fk-header-tab-book"));
		booksMenu.click();
//		driver.findElement(By.linkText("Books Home")).click();
		System.out.println("Clicked Books");
		List<WebElement> items = driver.findElements(By.cssSelector(".fk-product-thumb.fkp-medium"));
		System.out.println("size : "+items.size());
		for (WebElement item: items){
			WebElement titleElem = item.findElement(By.cssSelector(".title.tpadding5.fk-anchor-link"));
			WebElement prizeElem = item.findElement(By.cssSelector(".price.final-price"));
			System.out.println("Title: "+ titleElem.getAttribute("title")+", price: "+prizeElem.getText());
		}
		
		driver.close();
	}

}
