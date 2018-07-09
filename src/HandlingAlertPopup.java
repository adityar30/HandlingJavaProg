import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); //initialize Chrome browser
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement Goclick=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input"));
		Goclick.click();
		Thread.sleep(3000);
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		Goclick.click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	
	}

}
