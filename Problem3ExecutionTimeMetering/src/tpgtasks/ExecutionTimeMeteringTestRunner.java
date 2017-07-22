package tpgtasks;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ExecutionTimeMeteringTestRunner {
	public static void main(String[] args) {
		 Injector injector = Guice.createInjector(new ExecutionTimeMeteringModule());
		 TestObject test_object = injector.getInstance(TestObject.class);
		 //some random test  
		 test_object.RunForMilliSeonds(500);
		 test_object.RunForMilliSeonds(368);
		 test_object.RunForMilliSeonds(1340);
		 
	}
}
