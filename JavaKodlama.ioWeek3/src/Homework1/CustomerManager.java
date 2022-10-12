package Homework1;

public class CustomerManager {

	private Customer customer;
	private CreditManagers creditManagers;
	
	
	public CustomerManager(Customer customer, CreditManagers creditManagers) {
		this.customer = customer;
		this.creditManagers=creditManagers;
	}


	public void save() {
		System.out.println(customer.id + " is Saved.");
	}
	
	
}
