package maventest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Usingthread extends Sample2 {

@Test
public void Apple()
	{
	
	System.out.println("Chrome"+Thread.currentThread().getId());
	System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");

	driver.close();

	}

@Test
public void Guava()
	{
	System.out.println("Guava"+Thread.currentThread().getId());
	System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.close();
	}

@Test
public void Girl()
	{

	 System.out.println("Girl "+Thread.currentThread().getId());
	}

	}

 