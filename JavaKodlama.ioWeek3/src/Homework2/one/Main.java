package Homework2.one;

public class Main {

	public static void main(String[] args) {
		
		BaseLogger[] loggers = {new EmailLogger(),new FileLogger(), new DatabaseLogger(), new ConsoleLogger()};
		for (BaseLogger baseLogger : loggers) {
			baseLogger.log("Log mesage");
		}
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
