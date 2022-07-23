package commonClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class WrapClass {
	
	
	
	public static void click(WebElement webElementToClick) {
		webElementToClick.click();
	}
	
	
	public static void sendKeys(WebElement webElementToSendText, String textToSend) {
		webElementToSendText.sendKeys(textToSend);
	}
	
	
	public static void takeScreenshot(WebDriver webdriver, String testCaseName) {
		
		//
		File scrFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		
		//
		String screenshotPath = "./test-output/ExecutionResults";
		
		
		try {
			FileHandler.createDir(new File(screenshotPath));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			FileHandler.copy(scrFile, new File(screenshotPath + File.separator + testCaseName + ".png"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static String getJSONValue(String jsonFileObj, String jsonkey) {
		
		//jsonData
		try {
			InputStream inputStream = new FileInputStream("./src/test/resources/jsonData/" + jsonFileObj + ".json");
			JSONObject jsonObj = new JSONObject(new JSONTokener(inputStream)); //convertimos el archivo a un objeto de json de JAVA
			
			//GETDATA
			String jsonValue = (String) jsonObj.getJSONObject(jsonFileObj).get(jsonkey);
			return jsonValue;
			
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	
	
	public static String getCellData(String excelName, int row, int columna) {
		
		try {
			//leyendo data
			FileInputStream fis = new FileInputStream("./src/test/resources/excelData/" + excelName + ".xlsx");
			//construir un objeto de excel
			@SuppressWarnings("resource")
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheetAt(0);
			Row rowObj = sheet.getRow(row);
			Cell cell = rowObj.getCell(columna);
			String value = cell.getStringCellValue();
			return value;
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

}
