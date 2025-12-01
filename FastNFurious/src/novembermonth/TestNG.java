package novembermonth;

import org.testng.annotations.*;

public class TestNG {

	@Test
	public void a2() {
		System.out.println("Hello a2 tester");
	}

	@BeforeTest
	public void b() {
		System.out.println("Hello b tester");
	}

	@BeforeSuite
	public void c() {
		System.out.println("Hello c tester");
	}

	@AfterMethod

	public void d() {
		System.out.println("Hello d tester");
	}

	@BeforeClass
	public void e() {
		System.out.println("Hello e tester");
	}

	@AfterTest
	public void f() {
		System.out.println("Hello f tester");
	}

	@AfterClass
	public void g() {
		System.out.println("Hello g tester");
	}

	@BeforeMethod
	public void h() {
		System.out.println("Hello h tester");
	}

	@AfterSuite
	public void i() {
		System.out.println("Hello i tester");
	}

	@Test
	public void a1() {
		System.out.println("Hello a1 testing tester");
	}

	@Test
	public void A1() {
		System.out.println("Hello A1 testing tester");
	}

	// we can write TestNG annotations and Java main method in one program and its
	// bifurcations will be done when we want to run it
	// so we will get two options while running the program
	// 1-run as java program , 2- run as testng test case
	public static void main(String[] args) {
		System.out.println("Hello Anna");

		// after executing the test case if we refresh the project then we will be able
		// to see test output folder containing the
		// results of the test cases that we have executed.
		
		//this will contain emailable report, index .html
		

	}

}
