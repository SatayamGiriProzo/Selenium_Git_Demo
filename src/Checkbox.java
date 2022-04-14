import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver.exe");
		WebDriver Sold = new ChromeDriver();
		Sold.get("https://www.spicejet.com/");
//		
//		Thread.sleep(3000);
//		Sold.findElement(By.xpath("//div/[Contains(text(), 'Family & Friends'")).click();
//		Sold.findElement(By.name("Family & Friends")).click();
//		//Div[@contains(text(), 'Govt. Employee')]
		Assert.assertFalse(Sold.findElement(By.cssSelector("div[class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-urutk0 r-8uuktl r-136ojw6'] :nth-child(2) :nth-child(6) :first-child :first-child :first-child :first-child :first-child :nth-child(2)")).isSelected());
		Assert.assertFalse(false);
	    System.out.println(Sold.findElement(By.cssSelector("div[class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-urutk0 r-8uuktl r-136ojw6'] :nth-child(2) :nth-child(6) :first-child :first-child :first-child :first-child :first-child :nth-child(2)")).isSelected());
		Sold.findElement(By.cssSelector("div[class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-urutk0 r-8uuktl r-136ojw6'] :nth-child(2) :nth-child(6) :first-child :first-child :first-child :first-child :first-child :nth-child(2)")).click();
		Thread.sleep(5000);
		System.out.println(Sold.findElement(By.cssSelector("div[class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-urutk0 r-8uuktl r-136ojw6'] :nth-child(2) :nth-child(6) :first-child :first-child :first-child :first-child :first-child :nth-child(2)")).isSelected());
		
		
		
	}

}
