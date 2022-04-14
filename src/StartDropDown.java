import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StartDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver.exe");
		WebDriver Drop = new ChromeDriver();
		Drop.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Select dropDown = new Select(Drop.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		dropDown.selectByIndex(3);
		 System.out.println(dropDown.getFirstSelectedOption().getText());
		dropDown.selectByVisibleText("INR");
	    System.out.println(dropDown.getFirstSelectedOption().getText());
	    
	    
	}

}
