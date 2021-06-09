package TestNGclass;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name = "testData")
	public Integer[][] dp_GetData(Method m){
		
		if(m.getName().equalsIgnoreCase("myFirstTestNGMethod"))
			return new Integer[][]{ {1,2,5},
				{2,2,4},
				{4, 4, 8}};
	else 
		return new Integer[][] {{20,10},{5,2}};
	}
}
