package tpgtasks;
/***
 * if any class instance created as following
 * eg.
 * 	  Injector injector = Guice.createInjector(new ExecutionTimeMeteringModule());
 *	  TestObject test_object = injector.getInstance(TestObject.class); and that
 * and if the method of that class is tagged with @ExecutionTimeMetering,
 * then whenever that method is called , it will show execution time for that method in console
 */
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExecutionTimeMetering {}
