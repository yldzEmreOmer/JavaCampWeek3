package Homework3.core;

public class EmailLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Email has been sent.: " + data);
		
	}

}
