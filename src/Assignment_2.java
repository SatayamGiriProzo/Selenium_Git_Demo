import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String Gamer = "MidNightLostChild";
		String Email = "MidNightLostChild121@gmail.com";
		String Password = "100YearQuest";
		driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys(Gamer);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);
        driver.findElement(By.id("exampleInputPassword1")).sendKeys(Password);
        driver.findElement(By.id("exampleCheck1")).click();
        Select Gen = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
        Gen.selectByVisibleText("Male");
        driver.findElement(By.id("inlineRadio2")).click();
        driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("06-06-1006");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
       
	}

}
