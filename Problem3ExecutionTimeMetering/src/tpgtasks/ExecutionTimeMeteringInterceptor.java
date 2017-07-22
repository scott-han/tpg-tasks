package tpgtasks;
/**
 * 
 */
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;



public class ExecutionTimeMeteringInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		 
			long startTime = System.currentTimeMillis();
	        Object result = arg0.proceed();
	        long endTime = System.currentTimeMillis();
	        long elapsed = endTime - startTime;
	        System.out.println("Method " + arg0.getMethod().getName() 
	        		+ " runs for " + elapsed + " millisecond." );
	        return result;
	}

}
