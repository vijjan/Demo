package stepDefi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import DepInjectionPico.Pico;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;

public class LandingPageStepDef {
	
	public Pico obj1;
	public String pname;
	
	
	
	public LandingPageStepDef (Pico obj2 ) {
		this.obj1=obj2;
		
	}
	
	public LandingPageStepDef() {
		
	}


	@Given("user is on greencart landing page")
	public void user_is_on_greencart_landing_page() {
	
//		System.setProperty("browser driver name", "driver path");
		
		obj1.driver = new ChromeDriver();
		obj1.driver.manage().window().maximize();
		obj1.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		obj1.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

	
	
	}
	
	@When("^user searched with shortname and extracted actual (.+) of product$")
    public void user_searched_with_shortname_and_extracted_actual_of_product(String Data) throws InterruptedException {
	
		
		LandingPage lpo =new LandingPage(obj1.driver);
		lpo.SearchItem(Data);
		lpo.GetItem();
		
//		obj1.driver.findElement(By.cssSelector("input.search-keyword")).sendKeys(Data);
//		WebDriverWait w= new WebDriverWait(obj1.driver,Duration.ofSeconds(1));
		Thread.sleep(1000);
		obj1.pname = obj1.driver.findElement(By.cssSelector("div h4.product-name")).getText().split(" ")[0].trim();
		obj1.driver.findElement(By.xpath("//a[text()=\"Top Deals\"]")).click();
	
	
	}    
        
     
}
