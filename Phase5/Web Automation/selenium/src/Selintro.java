import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selintro {
	
public static void main(String[] args){
	
//	For Chrome Browser
	
	System.setProperty("webdriver.chrome.driver", "D:\\softwares\\Chromedriver\\chromedriver.exe.exe");
	WebDriver driver = new ChromeDriver();
	
//	For Edge Browser
//	System.setProperty("webdriver.edge.driver", "C:\\Users\\sbrah\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//	EdgeDriver driver = new EdgeDriver();
//	


	driver.get("http://simplilearn.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.quit();

}
}

