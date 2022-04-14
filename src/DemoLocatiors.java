import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocatiors {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver.exe");
		WebDriver dope = new ChromeDriver();
		dope.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dope.get("https://rahulshettyacademy.com/locatorspractice/");
		dope.findElement(By.id("inputUsername")).sendKeys("Satymagiri");
		dope.findElement(By.name("inputPassword")).sendKeys("9870365226");
		dope.findElement(By.cssSelector("button.submit")).click();
		System.out.println(dope.findElement(By.cssSelector("p.error")).getText());
		dope.findElement(By.linkText("Forgot your password?")).click();	
		Thread.sleep(2000);
		dope.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Satyam giri");
		dope.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Satyamgiri9@gmail.com");
		dope.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9870365226");
		dope.findElement(By.className("reset-pwd-btn")).click();
//		System.out.println(dope.findElement(By.cssSelector("form p")).getText());
//		System.out.println(dope.findElement(By.cssSelector(".infoMsg")).getText());
//		System.out.println(dope.findElement(By.xpath("//form/p")).getText());
		System.out.println(dope.findElement(By.cssSelector("form p")).getText());
		
		dope.findElement(By.className("go-to-login-btn")).click();
		
		Thread.sleep(2000);
		
		dope.findElement(By.cssSelector("#inputUsername")).sendKeys("Satymagiri");
		dope.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		dope.findElement(By.cssSelector("input[type*='checkbox']")).click();
//		dope.findElement(By.id("chkboxTwo")).click();
		dope.findElement(By.cssSelector("button.submit")).click();
		
		
		
	}

}
