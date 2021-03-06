package maventest;

import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import mainpackage.Mainclass1;
import mainpackage.PageObjModel;
@Listeners(listenerpackage.ListenerClass.class)

public class TestClass extends Mainclass1 {
	@Test(dataProvider = "LoginData")
	public void excute(String UserName,String Password,String Run)
	{
		PageObjModel obj = new PageObjModel(driver);
		obj.login(UserName,Password);
	}

	@DataProvider(name = "LoginData")
	public Object[][] sampledata() {
		Object[][] data = getExcelData("TestData.xlsx", "Credentialsu");
		return data;
	}
}
