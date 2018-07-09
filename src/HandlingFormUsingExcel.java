import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFormUsingExcel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialsize Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

		WebElement Username = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]"));
		Username.sendKeys("Tester");

		WebElement Password = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]"));
		Password.sendKeys("test");

		WebElement Login = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']"));
		Login.click();

		Thread.sleep(3000);

		WebElement OrderClick = driver.findElement(By.xpath("//*[@id=\"ctl00_menu\"]/li[3]/a"));
		OrderClick.click();

		Xls_Reader obj = new Xls_Reader("E:\\Selenium\\FilesConcept\\Form.xlsx");

		WebElement Productdropdown = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_ddlProduct\"]"));

		WebElement Quantity = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));

		WebElement CustomerName = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtName\"]"));

		WebElement Street = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]"));

		WebElement City = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]"));

		WebElement Zip = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox5\"]"));

		String CardXpathStart = "//*[@id=\'ctl00_MainContent_fmwOrder_cardList_";

		String CardXpathEnd = "']";

		WebElement CardNumber = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_TextBox6']"));

		WebElement ExpireDate = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]"));
		
		WebElement ProcessButton = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
		

		for (int i = 2; i <= 4; i++) {
			for (int j = 1; j <= 8; j++) {

				Productdropdown.sendKeys(obj.getCellData("Data", i, j));
				Quantity.sendKeys(obj.getCellData("Data", i, j));
				CustomerName.sendKeys(obj.getCellData("Data", i, j));
				Street.sendKeys(obj.getCellData("Data", i, j));
				City.sendKeys(obj.getCellData("Data", i, j));
				Zip.sendKeys(obj.getCellData("Data", i, j));
				int k = 0;
				WebElement Card = driver.findElement(By.xpath(CardXpathStart + k + CardXpathEnd));
				Card.click();
				CardNumber.sendKeys(obj.getCellData("Data", i, j));
				ExpireDate.sendKeys(obj.getCellData("Data", i, j));
				k++;
				ProcessButton.click();
			}
			
			Thread.sleep(3000);
		}

		driver.close();
		driver.quit();

	}

}
