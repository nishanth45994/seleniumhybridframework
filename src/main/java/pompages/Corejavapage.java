package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Corejavapage {
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
	private WebElement corejavaforselenium;
	
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement closebtn;
	
	public Corejavapage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void CorejavapPage() {
		corejavaforselenium.click();
		
	}
	
	public void closeButton() {
		closebtn.click();
    }

	
	

}
