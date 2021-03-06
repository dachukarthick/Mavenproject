package objectpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleObject {
public WebDriver driver;	
@FindBy(id="email")
WebElement inp_username;
@FindBy(id="pass")
WebElement inp_password;
@FindBy(xpath="//button[@name='login']")
WebElement btn_login;
@FindBy(linkText="Forgotten password?")
WebElement slt_link;

public SampleObject (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public void valuesDisplay() 
	{
		inp_username.sendKeys("14dharshinis@gmail.com");
		inp_password.sendKeys("pass@123");
		btn_login.click();
		slt_link.click();
	}

}
