package TestNGclass;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryListener implements IRetryAnalyzer{

	private static int count =0;
	private static final int MAXCOUNT =4;
	
	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess()) {
			if(count<MAXCOUNT) {
				count++;
				result.setStatus(ITestResult.FAILURE);
				return true;
			}
			else {
				result.setStatus(ITestResult.FAILURE);
			}
		}
		
		else {
			result.setStatus(ITestResult.SUCCESS);
		}
		return false;
	}

}
