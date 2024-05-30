package RetryTestCases;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
public class RetryListener implements IAnnotationTransformer {
	
public void transform(IAnnotationTransformer testAnnotation, Class TestClass,
Constructor TestConstructor, Method testMethod) {
	
	((ITestAnnotation) testAnnotation).setRetryAnalyzer(RetryAnalyzer.class);
}

}
