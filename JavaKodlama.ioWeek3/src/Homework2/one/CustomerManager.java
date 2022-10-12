package Homework2.one;

public class CustomerManager {

	private BaseLogger baseLogger;
	
	
	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}


	public void add() {
		System.out.println("Customer added");
		baseLogger.log("Log message");
	}
}
