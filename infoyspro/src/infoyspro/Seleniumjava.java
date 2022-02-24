package infoyspro;

import org.testng.annotations.Test;

public class Seleniumjava {
@Test(priority = 1,description = "she is so sweet")
public void sweet()
{
	System.out.println("print sweet");
}
@Test(priority=2,description = "she is so cute")
public void cute()
{
	System.out.println("print cute");
}
@Test(description = "she is fast racer")
public void fast()
{
	System.out.println("print faster");
}
@Test(priority=3)
public void slow()
{
	System.out.println("print slower");
}
}
