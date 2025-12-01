package novembermonth;

import org.testng.annotations.Test;

public class TestNG5 {
	@Test
	public void a() {
		System.out.println("Hello Test Method a");
	}
	
	@Test(invocationCount = 2, priority = -1, enabled = true & false) //bitwise operator me logc hai what it will return
	public void b() {
		System.out.println("Hello Test Method b");
	}
	
	@Test(invocationCount = 2)
	public void c() {
		System.out.println("Hello Test Method c");
	}
	
	@Test
	public void d() {
		System.out.println("Hello Test Method d");
	}
	
	

}
