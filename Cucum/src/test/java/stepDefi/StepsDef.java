//package stepDefi;
//
//import java.util.List;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class StepsDef {
//
//	
// 	@When ("Wouda")
// 	public void Wouda() {
// 		System.out.println("hey hey");
// 	}
//	
//	@Given ("user on web login page")
//	public void user_on_login_page() {
//		System.out.println("user landed on log web page");
//	}
//	@When ("user {string} enteres valid cred {string}")
//	public void user_enteres_valid_cred(String a, String b) {
//		
//		System.out.println("uname is = "+a);
//		System.out.println("password is = "+b);
//		
//	}
//	@Then ("should login succ") 
//	public void should_login_succ() {
//		System.out.println("congo you have been logged in succeessfullyy");
//	}
//
//	@Given("user landed on mobile home page")
//	public void user_landed_on_mobile_home_page() {
//		System.out.println("user on playstore");
//	}
//
////	@When("user {string} with valid {string} cred")
//	@When("^user (.+) with valid (.+) cred$")
//	public void user_with_valid_cred(String a, String b) {
//		System.out.println(a + " " + b);
//
//	}
//
//	@Then("user able to {string} login")
//	public void user_able_to_login(String c) {
//		System.out.println("logged " + c);
//	}
//
//}