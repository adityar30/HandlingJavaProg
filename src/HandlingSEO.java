import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSEO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialsize Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");	
		
		WebElement textbox=driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
		textbox.sendKeys("a");
		
		
		String xpathstart="/html/body/table/tbody/tr/td[2]/table/tbody/tr[";
		String xpathend="]/td/div/table/tbody/tr/td/span/b";
		
		int x=1;
		
		while(true)
		{
			String data=driver.findElement(By.xpath(xpathstart+x+xpathend)).getText();
			System.out.println(data);
			x++;
		}
		
		
	}

}
