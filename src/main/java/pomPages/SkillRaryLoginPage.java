package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryLoginPage {
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement geras;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillraryDemoapp;
	
	@FindBy(name="q")
	private WebElement serachtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement sumbitbtn;
	
	public SkillRaryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void gearsbtn() {
		geras.click();
	}
	
	public void skillrraydemoapplication() {
		skillraryDemoapp.click();
	}
	
	public void serachtextbox(String corsename) {
		serachtb.sendKeys(corsename);
		
	}
	
	public void searchbtn() {
		sumbitbtn.click();
	}
	

}
