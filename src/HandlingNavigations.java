import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNavigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); //initialize Chrome browser
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		
		WebElement Elementclick= driver.findElement(By.xpath("//*[@id=\"mainContent\"]/table[1]/tbody/tr[1]/td[6]/a"));
		Elementclick.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.close();
		driver.quit();
		
		
		
	}

}
