package sikuli;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Screen;

public class Sikuliprogram {
public static void main(String[] args) {
try {
System.setProperty("webdriver.gecko.driver","E:\\driver\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.filemail.com/share/upload-file");
driver.findElement(By.xpath("//label[@id='addBtn']")).click();
Screen s = new Screen();
s.wait("C:\\Users\\Dharshini\\Picture\\file.png", 20);
s.type("C:\\Users\\Dharshini\\Picture\\file.png", "C:\\Users\\Dharshini\\Desktop\\Java_Interview_Questions.docx");
s.click("C:\\Users\\Dharshini\\Pictures\\open.png");

Thread.sleep(5000);
driver.close();
		}
catch(Exception e)
{
System.out.println("Error thrown");
}
}}

