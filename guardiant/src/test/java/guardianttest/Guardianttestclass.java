package guardianttest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import guardiantobject.ObjectGuardiant;
import guardiantpackage.Mainclass;
@Listeners(listernerguardiant.ListenersGuardiant.class)
public class Guardianttestclass extends Mainclass {
@Test(priority=1)
public void loginfunction()
{
	ObjectGuardiant obj=new ObjectGuardiant(driver);
	obj.login();
}
}
