package guardiantpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Mainclass {
public WebDriver driver;
public Properties config() throws IOException
{
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"src/main/resources/guardiantconfig.properties");
	Properties anyobj = new Properties();
	anyobj.load(fis);
    return anyobj;	   
}
@BeforeTest
public void login() throws IOException
{
System.setProperty("webdriver.chrome.driver","E:\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to(config().getProperty("url"));
   	driver.manage().window().maximize();
}
@AfterTest
public void exit()
{
driver.quit();
}
}
