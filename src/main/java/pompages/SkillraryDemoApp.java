package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApp {
	
	@FindBy(id="course")
	private WebElement coursebtn;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	@FindBy(name="addresstype")
	private WebElement addresstype;
	
	
	public WebElement getAddresstype() {
		return addresstype;
	}


	public SkillraryDemoApp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getCoursebtn() {
		return coursebtn;
	}
	
	public void seleniumTrainingBtn() {
		seleniumtraining.click();
	}

}

