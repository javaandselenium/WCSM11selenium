package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoPage {
	
	@FindBy(id="course")
	private WebElement course;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
    private WebElement seleniumtraining;
	
	@FindBy(name="addresstype")
	private WebElement testingdd;
	
	

	public SkillraryDemoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getTestingdd() {
		return testingdd;
	}

	public WebElement getCourse() {
		return course;
	}
	
	public void selenium() {
		seleniumtraining.click();
	}


	
	
	
}
