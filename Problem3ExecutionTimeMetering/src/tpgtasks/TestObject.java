package tpgtasks;

public class TestObject {
	@ExecutionTimeMetering
	void SleepOneSecond(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
