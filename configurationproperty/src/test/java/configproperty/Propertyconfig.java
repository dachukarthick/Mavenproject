import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Propertyconfig{
public WebDriver driver;
@Test
public void run() {
	
}
@BeforeTest
public void chromeLaunch() throws IOException
{
System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get(ConfigProperties().getProperty("url"));

}


@AfterTest
public void chromeClose()
{
driver.close();
}
}
