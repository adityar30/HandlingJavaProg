import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingKeyboardInteractions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialize Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		WebElement a=driver.findElement(By.xpath("//*[@id=\"search\"]")); 
		a.sendKeys("Khalibali");
		a.sendKeys(Keys.chord(Keys.SHIFT,Keys.F10));//For Combination of Keyboard Actions
		
		//a.sendKeys(Keys.ENTER);
		WebElement b= driver.findElement(By.xpath("//*[@id=\"video-title\"]"));
		b.click();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

}
