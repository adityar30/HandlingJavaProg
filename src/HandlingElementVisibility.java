import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingElementVisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialsize Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		WebElement Username = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]"));
		//Username.sendKeys("Tester");
		
		//one of the way
		/*if(Username.isDisplayed())
		{
			System.out.println("Element is displayed");
			
		} else
		{
			System.out.println("Element Invisible");
		}*/
		
		//2nd option
		
		if(driver.findElements(By.xpath("//*[@id=\"ctl00_MainContent_usernames\"]")).size()!=0)
		{
			System.out.println("Element is displayed");
		}else
		{
			System.out.println("Element is not displayed");
		}
		driver.close();
		driver.quit();
		
	}

}
