package selenium;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Testing3 {
	
	@Rule
	public ErrorCollector errcol=new ErrorCollector(); // declare this when you want to run the code if test fail
	
	@Ignore
	//@Test
	public void test6() {
		System.out.println("I am in testAssert");
		String actualerrormessage="abc";
		//String expectedErrormesage="abc1";  //for false condition and test fail
		String expectedErrormesage="abc"; 
		
		Assert.assertEquals(expectedErrormesage, actualerrormessage);
		//Assert.assertTrue("Verifying if 2>3", 2>3); // for false condition
		Assert.assertTrue("Verifying if 4>3", 4>3); // for true condition
		System.out.println("After 2nd assert ");
		
	}

		//@Test
		public void test7() {
			System.out.println("I am in testAssert");
			String actualerrormessage="abc";
			String expectedErrormesage="abc1"; 
				
			//for first condition false
			try
			{
				Assert.assertEquals(expectedErrormesage, actualerrormessage);
			}
			catch(Throwable t)
			{
				System.out.println("I am in Catch1");
				errcol.addError(t);
			}
			
			//for second condition false : catch2---------------
			try
			{
				Assert.assertTrue("Verifying if 2>3", 2>3);
			}
			catch(Throwable t)
			{
				System.out.println("I am in catch2");
				errcol.addError(t);
			}
			
			System.out.println("After 2nd assert ");	
		}

}