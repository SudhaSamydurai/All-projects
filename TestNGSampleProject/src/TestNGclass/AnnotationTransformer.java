package TestNGclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTransformer implements IAnnotationTransformer {
	
	@Override
	public void transform(ITestAnnotation testAnnotation, Class testClass, Constructor testConstructor, Method method) {
		testAnnotation.setRetryAnalyzer(IRetryListener.class);
	}

}
