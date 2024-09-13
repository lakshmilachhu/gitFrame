package programs;

import org.testng.annotations.Test;

public class PracticeTest {
	@Test(groups="ST")
	public void getDataTest()
	{
		System.out.println("Data is fetched from Practice");
	}
	
	@Test
	public void setDataTest()
	{
		System.out.println("Data is written from Practice");
	}
}
