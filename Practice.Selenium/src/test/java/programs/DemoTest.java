package programs;

import org.testng.annotations.Test;

public class DemoTest 
{
	@Test(groups="ST")
	public void getDataTest()
	{
		System.out.println("Data is fetched from Demo class");
	}
	
	@Test
	public void setDataTest()
	{
		
		System.out.println("Data is written from Demo");
	}

}
