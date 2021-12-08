package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingToCart {
	
	@FindBy(id="add")
	private WebElement add;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocart;
	
	public AddingToCart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void addingtocart() {
		addtocart.click();
	}

	public WebElement getAdd() {
		return add;
	}
	
	

}
