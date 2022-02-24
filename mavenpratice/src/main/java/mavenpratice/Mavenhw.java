package mavenpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mavenhw {
	@Test
	public void add()
{
System.setProperty("webdriver.chrome.driver","E:\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
driver.close();
}
}
