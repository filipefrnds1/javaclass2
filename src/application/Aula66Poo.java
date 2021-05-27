package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Aula66Poo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		//Product prod;
		//double total;
		int add,remove;
		//prod = new Product();
		
		System.out.println("Informe o nome do produto: ");
		String name = sc.next();
		
		System.out.println("Informe o preço do produto: ");
		double price = sc.nextDouble();
		
		System.out.println("Informe a quantidade do produto: ");
		int quantity = sc.nextInt();
		
		Product prod = new Product(name, price, quantity);
		
		System.out.println("Product data: " + prod);
		
		/*System.out.println("Informe o nome do produto: ");
		prod.name = sc.next();
		
		System.out.println("Informe o preço do produto: ");
		prod.price = sc.nextDouble();
		
		System.out.println("Informe a quantidade do produto: ");
		prod.quantity = sc.nextInt();
		
		System.out.println("Product data: " + prod);*/
		
		/*System.out.println("Nome do produto: " + prod.name);
		System.out.printf("Preço do produto: %.2f%n", prod.price);
		System.out.println("Quantidade do produto: " + prod.quantity);
		System.out.printf("Valor total no estoque: %.2f%n", prod.totalValueInStock());*/
		
		System.out.println("Enter the number of products to be added in stock: ");
		add = sc.nextInt();
		prod.addProducts(add);		
		System.out.println("Update data: " + prod);
		
		/*System.out.println("Nome do produto: " + prod.name);
		System.out.printf("Preço do produto: %.2f%n", prod.price);
		System.out.println("Quantidade do produto: " + prod.quantity);
		System.out.printf("Valor total no estoque: %.2f%n", prod.totalValueInStock());*/
		
		System.out.println("Enter the number of products to be removed in stock: ");
		remove = sc.nextInt();
		prod.removeProducts(remove);
		System.out.println("Update data: " + prod);
		
		/*System.out.println("Nome do produto: " + prod.name);
		System.out.printf("Preço do produto: %.2f%n", prod.price);
		System.out.println("Quantidade do produto: " + prod.quantity);
		System.out.printf("Valor total no estoque: %.2f%n", prod.totalValueInStock());*/
		
		
		sc.close();
	}

}
