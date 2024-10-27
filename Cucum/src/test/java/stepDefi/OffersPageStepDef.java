package stepDefi;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import DepInjectionPico.Pico;
import io.cucumber.java.en.Then;

public class OffersPageStepDef {

	
	Pico obj1;
	String lname;
	public OffersPageStepDef(Pico obj2 ) {
		
		this.obj1=obj2;
	}
	
	
	
	@Then("^user searched for same shortname in offers (.+) page$")
	public void user_searched_for_same_shortname_in_offers_page(String Data) throws InterruptedException {
		
		
		
		Set<String> s= obj1.driver.getWindowHandles();
		Iterator<String> i= s.iterator();
		i.next();
		String child= i.next();
		obj1.driver.switchTo().window(child);
	
		
		obj1.driver.findElement(By.cssSelector("input#search-field")).sendKeys(Data);
		lname = obj1.driver.findElement(By.cssSelector("tbody tr td:nth-child(1)")).getText();

		
		
	}
	
	
	@Then("user validate both match")
	public void user_validate_both_tom_match() {
		
		Assert.assertTrue(lname.equals(obj1.pname));		
		obj1.driver.quit();
		
	
	}
}
