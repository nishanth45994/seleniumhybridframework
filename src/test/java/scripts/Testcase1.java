package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pompages.AddtoCart;
import pompages.SkillraryDemoApp;
import pompages.skillrarylogin;

public class Testcase1 extends BaseClass {
	@Test
	public void tc1() {
		
	
	skillrarylogin s = new skillrarylogin(driver);
	s.gearsButton();
	s.skillraryDemoButton();
	
	
	
	SkillraryDemoApp sd = new SkillraryDemoApp(driver);
	driverutilities.switchTabs(driver);
	driverutilities.mousehover(driver, sd.getCoursebtn());
	
	sd.seleniumTrainingBtn();
	
	AddtoCart ac = new AddtoCart(driver);
	driverutilities.doubleclick(driver, ac.getPlusbtn());
	ac.addtoCartButton();
	
	
	}

}
