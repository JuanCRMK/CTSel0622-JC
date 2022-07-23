package loginTest;

import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import navigationPages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC_04_LoginParam {
	
	//Declaramos e inicializamos unobjeto del tipo WebDriver para utilizarlo en este Test cas
	WebDriver driver = DriverSetup.setupDriver();
	
	
	//pageObjects
	LoginPage login = new LoginPage(driver);
	
	
	
	
  @Test
  @Parameters ({"user","password"})
  public void TC04(String user, String password) {
	  
	  login.login(user, password);
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver.get(GlobalVariables.HOME_PAGE);
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
