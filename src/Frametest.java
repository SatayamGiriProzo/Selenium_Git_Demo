import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frametest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebElement switcher = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(switcher);
		WebElement targ = driver.findElement(By.id("droppable"));
		WebElement mover =driver.findElement(By.id("draggable"));
		Actions a = new Actions(driver);
		a.dragAndDrop(mover, targ).build().perform();
	}

}
