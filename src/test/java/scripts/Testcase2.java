package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pompages.SkillraryDemoApp;
import pompages.Testing;
import pompages.skillrarylogin;

public class Testcase2 extends BaseClass {
	@Test
	public void tc2() throws IOException {
		skillrarylogin s = new skillrarylogin(driver);
		s.gearsButton();
		s.skillraryDemoButton();
		
		
		SkillraryDemoApp sd = new SkillraryDemoApp(driver);
		driverutilities.switchTabs(driver);
		driverutilities.dropdown(sd.getAddresstype(), pdata.getPropertyfiledata("dropdowndata"));
		
		
		Testing t= new Testing(driver);
		driverutilities.draganddrop(driver, t.getSeleniumtrngbutton(),t.getMycart());
		t.Facebook();
		
	}
	

}
