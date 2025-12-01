package novembermonth;

import org.testng.annotations.Test;

public class TestNG7 {
	
	@Test(groups = "Regression")
	public void a() {
		System.out.println("Hello test a method");
	}
	
	@Test(groups = "Regression")
	public void b() {
		System.out.println("Hello test b method");
	}

	
	@Test(groups = "Smoke")
	public void c() {
		System.out.println("Hello test c method");
	}

	
	@Test(groups = {"Regression", "Sanity"})
	public void d() {
		System.out.println("Hello test d method");
	}

	
	@Test(groups = {"Regression", "Sanity"})
	public void e() {
		System.out.println("Hello test e method");
	}

	
	@Test(groups = {"Regression", "Sanity"})
	public void f() {
		System.out.println("Hello test f method");
	}

	
	@Test(groups = "Sanity")
	public void g() {
		System.out.println("Hello test g method");
	}

	
	
	

}
