package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterPage {
	
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbtn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Share via Twitter']")
	private WebElement twitter;
	
	public TwitterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void playButton() {
		playbtn.click();
	}
	
	public void pauseButton() {
		pausebtn.click();
	}
	
	public void twitterbtn() {
		twitter.click();
	}
	
	

}
