package TestNGclass;

import org.testng.annotations.Test;
public class Class2 {

	@Test(dataProvider = "testData", dataProviderClass = TestNGclass.DataProviderClass.class)
	public void mySecondTestNGMethod(int n1, int n2) {
		int sub = n1-n2;
		System.out.println(sub);
	}
}
