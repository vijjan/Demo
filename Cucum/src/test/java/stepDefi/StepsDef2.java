//package stepDefi;
//
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeStep;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class StepsDef2{
//
//	
//	@Given ("land on login page")
//	public void land_on_login_page() {
//		System.out.println("landed mobile");
//	}
//	@When ("enter cred")
//	public void enter_cred() {
//		System.out.println("cred entred");
//	}
//	@Then ("login")
//	public void login() {
//		System.out.println("logged  bhai logged");
//	}
//	 
//	
//	@Before (order=1)
//	public void Bm() {
//		System.out.println("--------------------");
//		System.out.println("its before annotation of order 1");
//		System.out.println("--------------------");
//	}
//	
//	@After
//	public void Am() {
//		System.out.println("--------------------");
//		System.out.println("its after annotation 1");
//		System.out.println("--------------------");
//	}
//	@Before (order=2)
//	public void Bm2() {
//		System.out.println("--------------------");
//		System.out.println("its before annotaion of order of 2 ");
//		System.out.println("--------------------");
//	}
//	
//}