package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testing {
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtrngbutton;
	
	@FindBy(id="mycart")
	private WebElement mycart;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookicon;
	
	
	public Testing(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getSeleniumtrngbutton() {
		return seleniumtrngbutton;
	}


	public WebElement getMycart() {
		return mycart;
	}


	public WebElement getFacebooicon() {
		return facebookicon;
	}
	
	
	public void Facebook(){
		facebookicon.click();
		
	}
	

}
