package mainpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjModel {
WebDriver driver;

@FindBy(id="email")
public static WebElement inp_username;

@FindBy(id="pass")
WebElement inp_password;

public PageObjModel(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void login(String UserName,String Password)
{
	inp_username.sendKeys(UserName);
	inp_password.sendKeys(Password);	
}
}
