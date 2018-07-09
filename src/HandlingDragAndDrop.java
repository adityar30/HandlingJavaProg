import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialize Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		WebElement DragElement=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement DropElement=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

		Actions a = new Actions(driver);
		
		
		a.dragAndDrop(DragElement, DropElement).build().perform();
		
		
		
		
		driver.close();
		driver.quit();
		
	}

}
