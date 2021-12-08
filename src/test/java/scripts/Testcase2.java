package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.FacebookPage;
import pomPages.SkillRaryLoginPage;
import pomPages.SkillraryDemoPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass{
	@Test
	public void tc2() throws FileNotFoundException, IOException {
		
		SkillRaryLoginPage s=new SkillRaryLoginPage(driver);
		s.gearsbtn();
		s.skillrraydemoapplication();
		
		utilies.switchTabs(driver);
		SkillraryDemoPage d=new SkillraryDemoPage(driver);
		utilies.dropDown(d.getTestingdd(),pdata.getData("dd"));
		
		TestingPage t=new TestingPage(driver);
		t.facebookicon();
		
		FacebookPage fb=new FacebookPage(driver);
		fb.likebtn();
		
		
		
		
		
		
		
		
	}

}
