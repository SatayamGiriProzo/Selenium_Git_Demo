import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,600)");
		Thread.sleep(1500);
		WebElement tab = driver.findElement(By.xpath("//table[@id='product' and @class='table-display']"));
		int row = tab.findElements(By.cssSelector("#product.table-display tr")).size();
		int coll = tab.findElements(By.cssSelector("#product.table-display tr th")).size();
		List<WebElement> output = driver.findElements(By.xpath("(//table[@id='product' and @class='table-display']/tbody/tr)[3]"));
		for(int i =0;i<output.size();i++) 
		{
			String name = output.get(i).getText();
			System.out.println(name);
		}
		System.out.println(row);
		System.out.println(coll);
		
	}

}
