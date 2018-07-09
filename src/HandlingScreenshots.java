import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScreenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialize Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");

		File Screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //This method will take screenshot and provide output as File
		FileUtils.copyFile(Screen,new File ("C:\\Users\\Admin\\Desktop\\Selenium Screenshots\\Selenium.jpeg"));//This method will take and save the file in the provided path

		driver.close();
		driver.quit();
	}

}
