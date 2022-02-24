package mainpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Propertymain {
public WebDriver driver;

@BeforeTest
public void chromeLaunch() throws IOException
{
System.setProperty("webdriver.chrome.driver","E:\\eclipse\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get(ConfigProperties().getProperty("url"));
}
@AfterTest
public void chromeClose()
{
driver.close();
}
public static Properties ConfigProperties() throws IOException
{
FileInputStream inputFile=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/"+"configproperty.properties");
Properties configFile=new Properties();
configFile.load(inputFile);

return configFile;

}
}

