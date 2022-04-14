import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartDropDown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver.exe");
		WebDriver Selo = new ChromeDriver();
		Selo.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Selo.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		Selo.findElement(By.xpath("//a[@Value='MAA']")).click();
		Thread.sleep(1000);
		Selo.findElement(By.xpath("(//a[@Value='BHO'])[2]")).click();
	}

}
