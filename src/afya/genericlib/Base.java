package afya.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class Base {
	public WebDriver driver;
	FileLib lib=new  FileLib();
	@BeforeClass
	public void configBc()
	{
		if(lib.getPropertyKeyValue("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./src/com/afya/resources/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver","./src/com/afya/resources/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.navigate().to(lib.getPropertyKeyValue("url"));
		driver.manage().window().maximize();
	}
	

}
