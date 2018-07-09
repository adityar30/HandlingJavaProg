import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebDriverEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialize Chrome browser
		HandlingListeners obj=new HandlingListeners();
		
		
		WebDriver driver = new ChromeDriver();
		
		EventFiringWebDriver a=new EventFiringWebDriver(driver);
		
		a.register(obj);
		
		a.manage().window().maximize();
		a.get("https://www.seleniumhq.org/download/");
		
		WebElement ele=a.findElement(By.xpath("//*[@id=\"mainContent\"]/table[1]/tbody/tr[1]/td[6]/a"));
		ele.click();
		
		a.navigate().back();
		
		System.out.println("Navigation success");
		
		Thread.sleep(2000);
		
		a.navigate().forward();
	
		a.close();
		a.quit();
	}

}
