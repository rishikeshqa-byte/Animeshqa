package novembermonth;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {

	// @Test - 1st way to make this test skip and this is the simplest way to get it
	// done
	public void a() {
		System.out.println("Hello Test Method a");
	}

    // widely used way in market
	@Test(enabled = false)
	public void b() {
		System.out.println("Hello Test Method b");
	}

	@Test(enabled = true)
	public void c() {
		System.out.println("Hello Test Method c");
	}

	
	//invocation count - 2times
	@Test(invocationCount = 2)
	public void d() {
		System.out.println("Hello Test Method d");

	}

	//invocation count =0 times
	@Test(invocationCount = 0)
	public void e() {
		System.out.println("Hello Test Method e");
	}

	//conditional skipping
	@Test
	public void f() {
		System.out.println("Hello Test Method f");
		throw new SkipException("Skipping f test method");
	}
}
