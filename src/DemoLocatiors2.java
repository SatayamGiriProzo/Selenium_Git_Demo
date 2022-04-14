import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class DemoLocatiors2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String User = "Satymagiri";
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver.exe");
//		WebDriver dope = new ChromeDriver();
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Documents\\msedgedriver.exe");
//		WebDriver dope = new EdgeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Documents\\geckodriver.exe");
		WebDriver dope = new FirefoxDriver();
		dope.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String Password = getPassword(dope);
		dope.get("https://rahulshettyacademy.com/locatorspractice/");
	    
		
		dope.findElement(By.id("inputUsername")).sendKeys(User);
		dope.findElement(By.name("inputPassword")).sendKeys(Password);
		
		dope.findElement(By.cssSelector("button.submit")).click();
		Thread.sleep(2000);
		System.out.println(dope.findElement(By.tagName("p")).getText());
		Assert.assertEquals(dope.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(dope.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello"+" "+User+",");
		dope.findElement(By.className("logout-btn")).click();
//		dope.close();
		
		
	}

	public static String getPassword(WebDriver dope) throws InterruptedException {
//		dope.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dope.get("https://rahulshettyacademy.com/locatorspractice/");
		dope.findElement(By.linkText("Forgot your password?")).click();	
		Thread.sleep(1000);
		dope.findElement(By.className("reset-pwd-btn")).click();
		
        String passWordText = dope.findElement(By.cssSelector("form p")).getText();
        String PassWord = passWordText.split("'")[1].split("'")[0];
//        dope.findElement(By.className("go-to-login-btn")).click();
        return PassWord;
        
        
	}
	
	
}
