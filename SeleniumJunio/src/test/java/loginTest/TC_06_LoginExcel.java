package loginTest;

import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import commonClasses.WrapClass;
import navigationPages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC_06_LoginExcel {
	
	//Declaramos e inicializamos unobjeto del tipo WebDriver para utilizarlo en este Test cas
	WebDriver driver = DriverSetup.setupDriver();
	
	
	//pageObjects
	LoginPage login = new LoginPage(driver);
	
	
	
	
  @Test
  public void TC06() {
	  String user = WrapClass.getCellData("TC_06", 1, 0);
	  String pwd = WrapClass.getCellData("TC_06", 1, 1);
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
