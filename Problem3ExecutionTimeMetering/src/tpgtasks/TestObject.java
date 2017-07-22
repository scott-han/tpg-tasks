package tpgtasks;

public class TestObject {
	/***
	 * if method annotated with @ExecutionTimeMetering,whenever called 
	 * it will show running time for this method
	 * 
	 * @param millisec
	 */
	@ExecutionTimeMetering
	void RunForMilliSeonds(int millisec){
		try {
			Thread.sleep(millisec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
