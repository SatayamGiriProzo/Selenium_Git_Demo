import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocatiors3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver.exe");
		WebDriver Practice = new ChromeDriver();
		Practice.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(Practice.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		Practice.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a[2]")).click();
	}

}
