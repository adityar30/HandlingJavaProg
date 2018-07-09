import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomation {

	public static void main (String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); //initialize Chrome browser
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		WebElement Username=driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		Username.sendKeys("adityar3016");
		
		WebElement LoginClick=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content"));
		LoginClick.click();
		
		driver.close();
		driver.quit();
		
		
	}
}
