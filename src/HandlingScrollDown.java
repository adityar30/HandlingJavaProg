import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialsize Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		
		//((JavascriptExecutor)driver).executeScript("alert('Dont Sleep')");

		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,10000)");
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-10000)");
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
