package maventest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import mainpackage.Mainclass1;
@Test
public class Mainclass2 extends Mainclass1 {
public void testrun()
{
driver.findElement(By.id("email")).sendKeys("14dharshinis@gmail.com");
driver.findElement(By.id("pass")).sendKeys("password");
driver.findElement(By.name("login")).click();
} 
}
