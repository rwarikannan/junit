import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class Sample {
	@BeforeClass
	public static void openapp()
	{
		System.out.println("Beforeclass");
		
	}
    
	
	@AfterClass
	public static void closeapp()
	{
		System.out.println("Afterclss");
		
	}
@Before
public void createaccount()
{
	System.out.println("Before");
	
}

@After
public void closeaccount()
{
	System.out.println("After");
	
}	
@BeforeAll

public void setup()
{
	System.out.println("beforeAll");
	
}

@AfterAll
public void teardown()
{
	System.out.println("test");
	
}
	
@Test
public void test()
{
	System.out.println("test");
}
	
}

