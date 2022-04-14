import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SallIntrod {
	public static void main(String[] args) {

	//invoking Browser
	//Chrome - ChormeDriver ->Methods
	//ChromeDriver driver	 = new ChromeDriver();
	//FirefoxDriver Lover1 = new FirefoxDriver();
//		WebDriver prob = new EdgeDriver();
	
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Documents\\msedgedriver.exe");
//	WebDriver prob = new EdgeDriver();
	


	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver.exe");
	WebDriver prob1 = new ChromeDriver();
	
	
//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Documents\\geckodriver.exe");
//	WebDriver prob2 = new FirefoxDriver();
	
	
	
	
	
	
	
	prob1.get("https://www.primevideo.com/?ref_=dvm_pds_amz_in_as_s_g_16_mkw_sTnB75HA9-dc&mrntrk=pcrid_423192672131_slid__pgrid_82649959367_pgeo_1007820_x__ptid_kwd-332566197011");
	System.out.println(prob1.getTitle());
	System.out.println(prob1.getCurrentUrl());
	prob1.close();
	
	}





}
