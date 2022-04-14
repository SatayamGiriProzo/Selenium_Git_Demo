import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//1 all element count
		int count = driver.findElements(By.tagName("a")).size();
		System.out.println(count);
		//2 Footer Element count
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		//3. Collums Element Count
		WebElement foot1 = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(foot1.findElements(By.tagName("a")).size());
		//4 Checking if links are working
		for(int i = 1; i<foot1.findElements(By.tagName("a")).size();i++) 
		{
		
			String clickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
		  foot1.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
		  Thread.sleep(2000);
		}
		  //5 Get the title of each and every page
		  Set<String>pages = driver.getWindowHandles();
		  Iterator<String> winId = pages.iterator();
		  while(winId.hasNext()) 
		  {
			  driver.switchTo().window(winId.next());
			  System.out.println(driver.getTitle());
		  }
		  
			
			
		
		
		
		
	}

}
