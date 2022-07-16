package loginTest;

import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import navigationPages.DashboardPage;
import navigationPages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC_02_Logout {
	
	
	//Declaramos e inicializamos unobjeto del tipo WebDriver para utilizarlo en este Test cas
		WebDriver driver = DriverSetup.setupDriver();
		
		
		//pageObjects
		LoginPage login = new LoginPage(driver);
		DashboardPage dashboard = new DashboardPage(driver);
		
	
  @Test
  public void TC_02() {
	  
	  login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PWD_ADMIN);
	  dashboard.logout();
	  
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
