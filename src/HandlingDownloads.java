import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDownloads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialize Chrome browser
		HashMap<String,Object> d=new HashMap<String,Object>();
		d.put("download.default_directory", "E:\\Selenium");
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", d);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://docs.seleniumhq.org/download/");
		
		WebElement download=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/p[7]/a[2]"));
		download.click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.elementToBeClickable(download));
		wait.until(ExpectedConditions.visibilityOf(download));
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
	}

}
