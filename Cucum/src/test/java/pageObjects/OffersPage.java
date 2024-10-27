package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	public WebDriver driver;

	
	public OffersPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public By SearchItem=By.cssSelector("input#search-field");
	public By getItem = By.cssSelector("tbody tr td:nth-child(1)");
	
		
	
	public void Vanish() {
		driver.quit();
		
	}
	
	public void SearchItem(String Data) {
		driver.findElement(SearchItem).sendKeys(Data);
		
	}
	
	public String getItem() {
		return driver.findElement(getItem).getText();
	}
	
	
	
}