package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddingToCart;
import pomPages.SkillRaryLoginPage;
import pomPages.SkillraryDemoPage;

public class Testcase1  extends BaseClass{
	
	@Test
	public void tc1() {
		SkillRaryLoginPage s=new SkillRaryLoginPage(driver);
		s.gearsbtn();
		s.skillrraydemoapplication();
		
		utilies.switchTabs(driver);
		SkillraryDemoPage d=new SkillraryDemoPage(driver);
		utilies.mouseHover(driver,d.getCourse());
		d.selenium();
		
		AddingToCart a=new AddingToCart(driver);
		utilies.doubleClick(driver,a.getAdd());
		a.addingtocart();
		utilies.alertPopup(driver);
		
		
	}

}
