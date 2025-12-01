package novembermonth;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG6 {
	
	@Test
	public void z() {
		Assert.assertTrue(3<12);
		System.out.println("Hello z method");
	}
	
	@Test
	public void a() {
		Assert.assertTrue(3>12);
		System.out.println("Hello a method");
	}
	
	@Test(dependsOnMethods = {"z", "a"})
	public void b() {
		
		System.out.println("Hello z method");
	}
	
	//this is alll about the depends on methods where the third will execute if the first and second is passed else it will be skipped.
	
	
	

}
