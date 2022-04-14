import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StartDropDown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver.exe");
		WebDriver Drop = new ChromeDriver();
		Drop.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(Drop.findElement(By.xpath("//div/input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		Assert.assertFalse(false);
		System.out.println(Drop.findElement(By.xpath("//div/input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		Drop.findElement(By.xpath("//div/input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		
		System.out.println(Drop.findElement(By.xpath("//div/input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		
		Drop.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
//		int i = 1;
//		while(i<5) 
//		{
//			Drop.findElement(By.id("hrefIncAdt")).click();	
//			i++;
//			
//		}
		
		for(int i =1;i<3;i++) {
			Drop.findElement(By.id("hrefIncAdt")).click();	
	
		}
		
		Drop.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(Drop.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
	    System.out.println(Drop.findElement(By.id("divpaxinfo")).getText());
		
		
	}

}
