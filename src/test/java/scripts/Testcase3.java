package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillRaryLoginPage;
import pomPages.TwitterPage;

public class Testcase3  extends BaseClass{

	@Test
	public void tc3() throws FileNotFoundException, IOException, InterruptedException {
		SkillRaryLoginPage  s=new SkillRaryLoginPage(driver);
		s.serachtextbox(pdata.getData("courseName"));
		s.searchbtn();
		
		CoreJavaPage c=new CoreJavaPage(driver);
		c.corejavaselenium();
		
		TwitterPage t=new TwitterPage(driver);
		utilies.switchToframe(driver);
		t.playButton();
		Thread.sleep(10000);
		t.pauseButton();
		utilies.switchBacktoFrame(driver);
		t.twitterbtn();
		
		
		
	}
	
	
}
