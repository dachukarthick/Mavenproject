package praticetestpackage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import objectpackage.SampleObject;
import praticepackage.SampleMain;
 

@Listeners(listenerpackage.SampleListener.class)

public class SampleTest extends SampleMain{
	@Test
public void createObject()
{
logger=extent.startTest("createObect");
SampleObject object=new SampleObject(driver);
object.valuesDisplay();
}

}
