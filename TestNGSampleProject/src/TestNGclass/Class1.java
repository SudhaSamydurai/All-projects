package TestNGclass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class1 {

	@Test(invocationCount = 3, dataProvider = "testData", dataProviderClass = TestNGclass.DataProviderClass.class)
//	@Parameters({"value1", "value2", "value3"})
	public void myFirstTestNGMethod(int n1, int n2, int sum) {
		System.out.println(Thread.currentThread().getId());
		int result = n1 + n2;
		Assert.assertEquals(result, sum);
	}

}
