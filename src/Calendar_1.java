import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://wms.prozo.com/auth/login");
		Thread.sleep(2000);
		drive.findElement(By.cssSelector("input[name='domain']")).sendKeys("grv");
		drive.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		drive.findElement(By.xpath("//input[@name='email']")).sendKeys("8368252148");
		drive.findElement(By.xpath("//input[@name='password']")).sendKeys("1");
		drive.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		drive.findElement(By.cssSelector("button[class='MuiButtonBase-root MuiIconButton-root MuiAutocomplete-popupIndicator']")).click();
		Thread.sleep(1000);
//		drive.findElement(By.xpath("//div[@class='MuiAutocomplete-endAdornment']/button[@class='MuiButtonBase-root MuiIconButton-root MuiAutocomplete-clearIndicator MuiAutocomplete-clearIndicatorDirty']")).click();
		Thread.sleep(1000);
		drive.findElement(By.cssSelector("input[class='MuiInputBase-input MuiOutlinedInput-input MuiAutocomplete-input MuiAutocomplete-inputFocused MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense']")).sendKeys("MH");
	    Thread.sleep(1000);
		List<WebElement> Opt = 	drive.findElements(By.cssSelector("input[class='MuiInputBase-input MuiOutlinedInput-input MuiAutocomplete-input MuiAutocomplete-inputFocused MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense']"));
		for (WebElement option : Opt) {
			if(option.getText().equalsIgnoreCase("MHE")) {
				 option.click();
				 break;
			}
		}
	    
//	    drive.findElement(By.linkText("Settings")).click();
//		Thread.sleep(1000);
//		drive.findElement(By.linkText("HSN Master")).click();
	    
		
	}

}
