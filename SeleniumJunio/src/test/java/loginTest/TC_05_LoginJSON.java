package loginTest;

import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import commonClasses.WrapClass;
import navigationPages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC_05_LoginJSON {
	
	//Declaramos e inicializamos unobjeto del tipo WebDriver para utilizarlo en este Test cas
	WebDriver driver = DriverSetup.setupDriver();
	
	
	//pageObjects
	LoginPage login = new LoginPage(driver);
	
	
	
	
  @Test
  public void TC05() {
	  String user = WrapClass.getJSONValue("TC_05", "username");
	  String pwd = WrapClass.getJSONValue("TC_05", "password");
	  login.login(user, pwd);
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver.get(GlobalVariables.HOME_PAGE);
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  WrapClass.takeScreenshot(driver, "TC01");
	  driver.close();
  }

}
