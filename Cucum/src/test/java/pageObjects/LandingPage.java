package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	public By SearchItem= By.cssSelector("input.search-keyword");
	public By GetItem=By.cssSelector("div h4.product-name");
	public By TopDeals=By.cssSelector("div h4.product-name");
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
	this.driver=driver;
	}

	public void SearchItem(String Data) {
		
		driver.findElement(SearchItem).sendKeys(Data);
		
	}
	
	public void TopDeals() {
		
		driver.findElement(TopDeals).click();
	}
	
	public String GetItem() {
		return driver.findElement(GetItem).getText();
		
		
	}
	public void SwitchToTopDeals () {
		Set<String> s= driver.getWindowHandles();
		Iterator<String> i=s.iterator();
		i.next();
		String child = i.next();
		driver.switchTo().window(child);
		
	}
	
	
	
}
