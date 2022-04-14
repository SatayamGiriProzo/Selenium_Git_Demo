import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calanders_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("li[class*='userLoggedOut']")).click();
		Thread.sleep(1000);	
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		String date = "30";
		WebElement post = driver.findElement(By.cssSelector("[class='DayPicker-Months'] [class='DayPicker-Month']:nth-of-type(1)"));
		List<WebElement> dates = post.findElements(By.cssSelector(".dateInnerCell"));
		Thread.sleep(1000);
		int d = post.findElements(By.cssSelector(".dateInnerCell")).size();
		//dates to be check
		System.out.println(d);
		for(int i =0;i<d;i++) 
		{
			String dateText = post.findElements(By.cssSelector(".dateInnerCell")).get(i).getText();
			if(dateText.equalsIgnoreCase(date)) 
			{
				post.findElements(By.cssSelector(".dateInnerCell")).get(i).click();
				break;
			}
		}
		
			
		
	}

}
