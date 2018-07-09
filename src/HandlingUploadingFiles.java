import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingUploadingFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); //initialize Chrome browser
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		
	//	WebElement UploadFile= driver.findElement(By.id("uploadfile_0"));
		
		WebElement UploadFile= driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
		
		UploadFile.sendKeys("C:\\Users\\Admin\\Desktop\\A.java");
		
		WebElement Checkbox=driver.findElement(By.xpath("//*[@id='terms']"));
		Checkbox.click();
		
		WebElement Submit=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
		Submit.click();
		
		driver.close();
		driver.quit();
	}

}
