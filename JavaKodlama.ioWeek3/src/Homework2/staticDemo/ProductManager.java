package Homework2.staticDemo;

public class ProductManager {

	public void add(Product product) {
		
		ProductValidator validator = new ProductValidator();
		if(ProductValidator.isValid(product)) {
			System.out.println("Added.");
		}
		else
			System.out.println("Product information is unvalid.");
		
	}
}
