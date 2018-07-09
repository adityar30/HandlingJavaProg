import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingTopNavigationMenuBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialize Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");

		WebElement MenuBar=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/ul/li[4]/div[1]/span"));
		
		Actions action= new Actions(driver); // Action Class to perform Mouse Hover Action
		action.moveToElement(MenuBar).build().perform();
		
		WebElement MenuBaroption=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/ul/li[4]/div[2]/div[2]/div/ul/li[3]/a"));
		MenuBaroption.click();
		driver.close();
		driver.quit();
		
	}

}
