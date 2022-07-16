package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class DashboardPage {
	
	
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy (id = "welcome")
	private WebElement welcomeDrpDwn;
	@FindBy (xpath = "//*[@id=\"welcome-menu\"]/ul/li[3]/a")
	private WebElement logoutLink;
	
	
	
	public void logout() {
		WrapClass.click(welcomeDrpDwn);
		
		WrapClass.click(logoutLink);
		
	}

}
