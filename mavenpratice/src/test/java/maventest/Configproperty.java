package maventest;

import java.io.IOException;

import org.testng.annotations.Test;

import mainpackage.PageObjModel;
import mainpackage.Propertymain;

public class Configproperty extends Propertymain{
	@Test
	public void run() throws IOException
	{
	PageObjModel.inp_username.sendKeys(ConfigProperties().getProperty("username"));
	}
}
