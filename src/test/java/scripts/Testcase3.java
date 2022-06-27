package scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pompages.Addtowhislistpage;
import pompages.Corejavapage;
import pompages.skillrarylogin;

public class Testcase3 extends BaseClass{
	@Test
	public void tc3() throws IOException, InterruptedException {
		skillrarylogin s= new skillrarylogin(driver);
		s.searchTextbox(pdata.getPropertyfiledata("course"));
		s.searchButton();
		
		Corejavapage c = new Corejavapage(driver);
		c.CorejavapPage();
		c.closeButton();
		
		Addtowhislistpage ad = new Addtowhislistpage(driver);
		driverutilities.switchtoFrames(driver);
		ad.playButton();
		Thread.sleep(10000);
		ad.pauseButton();
		driverutilities.switchbacktoFrames(driver);
		ad.whishList();
		
		
		//Assert.assertEquals(driver.getTitle(), "hhvhfhfihifj");
	}

}
