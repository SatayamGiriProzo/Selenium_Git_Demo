import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver.exe");
		WebDriver Prac = new ChromeDriver();
		Prac.manage().window().maximize();
		Prac.get("https://rahulshettyacademy.com/#/index");
		Prac.navigate().to("https://www.amazon.in/");
		Prac.navigate().back();
		Prac.navigate().forward();
//		
	}

}

