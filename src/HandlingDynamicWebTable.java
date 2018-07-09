import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialsize Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");	
		
		WebElement Username=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]"));
		Username.sendKeys("Tester");
		
		WebElement Password=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]"));
		Password.sendKeys("test");
		
		WebElement Login=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']"));
		Login.click();
		
		Thread.sleep(3000);
		
		WebElement table=driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/table/tbody/tr/td[2]/div[2]/div[3]"));
		
		List<WebElement> tr=table.findElements(By.tagName("tr"));
		System.out.println(tr.size());
		
		for(int i=0;i<tr.size();i++)
		{
			List<WebElement>td=tr.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<td.size();j++)
			{
				System.out.println(td.get(j).getText());
				//System.out.println("--");
			}
			
			System.out.println("--");
			
		}
		
		
		
		
		driver.close();
		driver.quit();

	}

}
