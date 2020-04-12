package selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Testing1 {
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class"); // run only once
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");  //run only once
	}

	@Before  		// run before each test case and it's not mandatory
	public void setUp() throws Exception {
		System.out.println("Before");
		System.out.println("login");
	}

	@After				// run after each test case and it's not mandatory
	public void tearDown() throws Exception {
		System.out.println("After");
		System.out.println("logout");
	}

	@Test
	public void test1() {
		//System.out.println("login"); //try to fail it and check : test2 and test3 pass
		System.out.println("Test1"); // try to fail and check : test 2 and test 3 fail
		//System.out.println("logout");
	}
	
	@Test  // It's mandatory to write @Test annotation.
	public void test2() {
		//System.out.println("login");
		System.out.println("Test2");
		//System.out.println("logout");
		
	}
	
	@Test
	public void test3() {
	//	System.out.println("login");
		System.out.println("Test3");
		//System.out.println("logout");
			}


}
