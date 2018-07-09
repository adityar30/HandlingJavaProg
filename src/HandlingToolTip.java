import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingToolTip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialize Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(0);	
		
		
		WebElement ToolTipElement= driver.findElement(By.xpath("//*[@id=\"age\"]"));
		Actions a= new Actions(driver);
String ToolTipmessage=ToolTipElement.getAttribute("title");
		
		System.out.println(ToolTipmessage);
		a.moveToElement(ToolTipElement).build().perform();
		
		Thread.sleep(3000);
		
		
		
		driver.close();
		driver.quit();
		
		
	}

}
