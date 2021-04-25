package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStep {
	
	@Given ("I have a search filed on Amazon page")
	public void isearchField() {
System.out.println("Given statement");
}
	
	@When ("I search for a product name {string} and price {int}")
	public void productNameSearch(String mobName, int price) {
		System.out.println("When statement" + mobName + " Price is: " + price);

}
	
	@Then ("Product with the name {string} should be displayed")
	public void productDisplayed(String mobile) {
		System.out.println("Then statement");

}
}
