import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartDropDown3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver.exe");
		WebDriver APC = new ChromeDriver();
		APC.get("https://rahulshettyacademy.com/dropdownsPractise/");
		APC.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List <WebElement> opt = APC.findElements(By.cssSelector("ul[class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all'] li"));
		
		for (WebElement Opt1:opt) {
			if(Opt1.getText().equalsIgnoreCase("india")) {
				
				Opt1.click();
				break;
				
			}
			
		}
		
		
	}

}
