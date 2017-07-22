package tpgtasks;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ExecutionTimeMeteringTestRunner {
	public static void main(String[] args) {
		 Injector injector = Guice.createInjector(new ExecutionTimeMeteringModule());
		 TestObject test_object = injector.getInstance(TestObject.class);
		 test_object.SleepOneSecond();
		 
	}
}
