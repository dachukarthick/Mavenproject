package guardiantobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectGuardiant {
public WebDriver driver;    
	@FindBy(xpath="//button[@id='all-home-launch-survey-Dental']")
	WebElement btn_dentalbutton;
	
	@FindBy(id="fullName")
	WebElement inp_firstname;
	
	@FindBy(name="age")
	WebElement inp_age;
	
	@FindBy(xpath="//li[@aria-label='21-49']")
	WebElement drp_age;
	
	@FindBy(id="email")
	WebElement inp_email;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn_continue;
	
	public ObjectGuardiant(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void login()
{
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	inp_firstname.sendKeys("Dharshini");	
	inp_age.click();
	drp_age.click();
	inp_email.sendKeys("14dharshinis@gmail.com");
	btn_continue.click();
}
}
