package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillrarylogin {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemobtn;
	@FindBy(name="q")
	private WebElement searchtextbox;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbutton;
	
	public skillrarylogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gearsButton() {
		gearsbtn.click();
	}
	 public void skillraryDemoButton() {
		 skillrarydemobtn.click();
	 }
	 public void searchTextbox(String coursename) {
		 searchtextbox.sendKeys(coursename);
	 }
	 public void searchButton() {
		 searchbutton.click();
	 }
	
	

}
