package Homework2.interfaces;

public class Main {

	public static void main(String[] args) {
		
		CustomerDao customerDao = new OracleCustomerDao();
		customerDao.add();
		CustomerManager customerManager = new CustomerManager(customerDao);
		customerManager.add();
	}

}
