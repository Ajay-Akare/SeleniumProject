package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBase {
public static WebDriver driver;
public static Properties p;
	@Test
	public static void launchDriver() throws IOException {
		
		p=new Properties();
		File f=new File(System.getProperty("user.dir")+"//src//test//resources//Config.propertie");
		FileInputStream fs=new FileInputStream(f);
		p.load(fs);
		String browsername=(String) p.get("browser");
		//System.out.println(p.get("browser"));
		
		if(browsername.equalsIgnoreCase("chrome")) {
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(co);
			
		}else if(browsername.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		
		driver.get("https://profile.w3schools.com/");
		driver.manage().window().maximize();
		
	}
}
