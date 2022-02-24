package infoyspro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Failskipcase {
@BeforeTest
public void number()
{
	System.out.println("two numbers");
}

@Test(priority = 1)
public void add()
{
	System.out.println("addition of 2 numbers");
}
@Test(priority = 2)
public void sub()
{
	throw new ArithmeticException("exception thrown for subtraction");
}
@Test(priority = 4)
public void mul()
{
	System.out.println("multiplication of 2 numbers");
}
@AfterTest
public void aprint()
{
	System.out.println("line print after test");
}
@Test(priority = 3)
public void div()
{
	System.out.println("division of 2 numbers");
}
}
