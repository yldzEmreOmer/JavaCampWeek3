package Homework2.staticDemo;

public class Main {

	public static void main(String[] args) {
		
		ProductManager productManager = new ProductManager();
		Product product =  new Product();
		product.id=10;
		product.name="Mouse";
		product.price=100;	
		productManager.add(product);

	}

}
