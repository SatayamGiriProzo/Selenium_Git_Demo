import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		String option = driver.findElement(By.xpath("//label[@for='bmw']")).getText();
//		System.out.println(option);
		Select drop = new Select(driver.findElement(By.id("dropdown-class-example")));
		drop.selectByVisibleText(option);
		driver.findElement(By.cssSelector("#name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText().contains(option));
		
			
		
		
		
		
	}

}
 