package Homework1;

public class Main {

	public static void main(String[] args) {
		
		//REFERNCE TYPES:
		int number1 = 10;
		int number2=20;
		number1=number2;
		number2=100;
		System.out.println(number1);
		//Result is: 20 because integer is not reference type.
		
		int[] numbers1= {1,2,3};
		int[] numbers2= {10,20,30};
		numbers1=numbers2;
		numbers2[0] = 100;
		System.out.println(numbers1[0]);
		//Result is: 100 because arrays are reference type.

		//CREDİT MANAGER:
		CreditManager creditManager  =new CreditManager();
		creditManager.calculate();
		creditManager.save();
		
		//CUSTOMER:
		Customer customer = new Customer();
		customer.id=1;
		customer.city="İstanbul";
		
		//COMPANY:
		Company company = new Company();
		company.companyName="Arçelik";
		company.id=100;
		company.taxtNumber="15344584";
		
		//PERSON:
		Person person = new Person();
		person.firstName= "Emir";
		person.lastName="Yıldız";
		
		//CREDITMANAGERS:
		CreditManagers creditManagers = new TeacherCreditManager();
		creditManagers.calculate();
		
		//CUSTOMER MANAGER:
		CustomerManager customerManager = new CustomerManager(customer, creditManagers);
		customerManager.save();
	}

}
