package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Aula76Construtor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int add,remove;
		
		
		System.out.println("Informe o nome do produto: ");
		String name = sc.next();
		
		System.out.println("Informe o preço do produto: ");
		double price = sc.nextDouble();
		
		//System.out.println("Informe a quantidade do produto: ");
		//int quantity = sc.nextInt();
		
		Product prod = new Product(name, price);
		
		prod.setName("computer");
		System.out.println("Updated name: " + prod.getName());
		
		System.out.println("Product data: " + prod);
		System.out.println("Enter the number of products to be added in stock: ");
		add = sc.nextInt();
		prod.addProducts(add);		
		System.out.println("Update data: " + prod);
		
		prod.setPrice(1200.00);
		System.out.println("Update Price: " + prod.getPrice());
		
	
		
		System.out.println("Enter the number of products to be removed in stock: ");
		remove = sc.nextInt();
		prod.removeProducts(remove);
		System.out.println("Update data: " + prod);
		
	
		
		
		sc.close();
	}

}
