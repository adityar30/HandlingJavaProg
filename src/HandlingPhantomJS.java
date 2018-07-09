import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class HandlingPhantomJS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("phantomjs.binary.path", "E:\\Selenium\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe"); // initialsize Chrome browser
		WebDriver driver = new PhantomJSDriver();
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");	
		
		WebElement Username=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]"));
		Username.sendKeys("Tester");
		
		WebElement Password=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]"));
		Password.sendKeys("test");
		
		WebElement Login=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']"));
		Login.click();
		
		Thread.sleep(3000);

		WebElement Celldata=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td[2]"));
		System.out.println(Celldata.getText());
		
		WebElement Celldata2=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[3]/td[2]"));
		System.out.println(Celldata2.getText());

		String xpathstart="//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[";
		
		String xpathend="]/td[2]";
		
		
		for (int x=2;x<=9;x++)//for printing Column data
		{
			
			String data=driver.findElement(By.xpath(xpathstart+x+xpathend)).getText();
			
			System.out.println(data);
		}
		
		String xpathColumnstart="//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td[";
		String xpathColumnend="]";
		
		for (int y=2;y<=11;y++)//For Printing Row data
		{
			
			String data=driver.findElement(By.xpath(xpathColumnstart+y+xpathColumnend)).getText();
			
			System.out.println(data);
		}
		
		String xpathTablestartrow="//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[";
		String xpathTableendrow="]/td[";
		String xpathTablestartcolumn="]";
		/*String xpathTablestartcolumn="//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[2";
		String xpathTableendcolumn="]/td[]";*/
	
		for (int i=2;i<=9;i++)//for printing Table data
		{
			
			for (int j=2;j<=12;j++)
			{
			String data=driver.findElement(By.xpath(xpathTablestartrow+i+xpathTableendrow+j+xpathTablestartcolumn)).getText();
			
			System.out.print(data+"---");
		}
			System.out.println();
		}
		
		driver.close();
		driver.quit();

	}

}
