package novembermonth;

import org.testng.annotations.*;

public class TestNG3 {
	
	/*@Test
	public void a() {
		System.out.println("Hello Test Method a");
	}
	
	@Test
	public void b() {
		System.out.println("Hello Test Method b");
	}
	
	@Test
	public void c() {
		System.out.println("Hello Test Method c");
	}
	
	@Test
	public void d() {
		System.out.println("Hello Test Method d");
		
		
		
	}*/
	
	@Test(priority = -10)
	public void a() {
		System.out.println("Hello Test Method a");
	}
	
	@Test(priority = 2)
	public void b() {
		System.out.println("Hello Test Method b");
	}
	
	@Test(priority = 1)
	public void c() {
		System.out.println("Hello Test Method c");
	}
	
	@Test
	public void d() {
		System.out.println("Hello Test Method d");
		
	
	}

}
