package commonClasses;

import org.openqa.selenium.WebElement;

public class WrapClass {
	
	
	
	public static void click(WebElement webElementToClick) {
		webElementToClick.click();
	}
	
	
	public static void sendKeys(WebElement webElementToSendText, String textToSend) {
		webElementToSendText.sendKeys(textToSend);
	}

}