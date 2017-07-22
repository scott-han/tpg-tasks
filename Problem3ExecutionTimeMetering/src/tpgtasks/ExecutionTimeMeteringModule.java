package tpgtasks;
/**
 * ExecutionTimeMeteringModule has configure method which bind the ExecutionTimeMeteringInterceptor
 * with annotation @ExecutionTimeMetering
 */
import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class ExecutionTimeMeteringModule extends AbstractModule {

	@Override
	protected void configure() {
        bindInterceptor(Matchers.any(),
        		Matchers.annotatedWith(ExecutionTimeMetering.class),
        		new ExecutionTimeMeteringInterceptor());
    }

}
