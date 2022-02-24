package maventest;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

public class Sample2{

	@Test(priority = 1, enabled = true)
	void login()
	{
	System.out.println("Addition- first method");
	System.out.println("Chrome"+Thread.currentThread().getId());
	System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.close();

	}

	@Test(priority = 2)
	void order()
	{
	System.out.println("order");
	}
}


