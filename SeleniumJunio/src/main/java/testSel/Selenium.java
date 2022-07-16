package testSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		String exePath = "./driver/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get(exePath);
        driver.get("System.out.println");
        driver.manage().window().maximize();

        //Obterne/Identificar los objetos/webeleme de la pagina web
        WebElement userName = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));
        WebElement btnLogin = driver.findElement(By.id("btnLogin"));

                //Login
                userName.sendKeys("Admin");
                Thread.sleep(2000);
                password.sendKeys("admin123");
                Thread.sleep(2000);
                btnLogin.click();

                //Click en AssignLeave
                WebElement btnAssignLeave = driver.findElement(By.className("quickLinkText"));
                btnAssignLeave.click();

                //Enviar a tect a employee name
                WebElement employeeName = driver.findElement(By.name("assignleave[txtEmployee][empName]"));
                employeeName.sendKeys("Rosario Alvarez");
                Thread.sleep(3000);
                employeeName.clear();

            //Obtener texto
                String welcomeName = driver.findElement(By.id("welcome")).getText();
                boolean name = welcomeName.contains("kathija");

                if (name) {
                    System.out.println("El mensaje contien el nombre de kathija");
                } else {
                    System.out.println("ERROR: el Mensaje no tiene el nombre de kota]");
                }

                //Dropdown
                Select drpLeaveType = new Select (driver.findElement(By.id("assignleave_txtLeaveType")));
                drpLeaveType.selectByVisibleText("US - FMLA");
		

	}

}
