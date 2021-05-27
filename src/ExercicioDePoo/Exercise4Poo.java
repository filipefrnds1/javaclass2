//Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais.
//Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
// sobre o valor em dólar. Criar uma classe CurrencyConverter para ser responsável pelos cálculos.

package ExercicioDePoo;

import java.util.Locale;
import java.util.Scanner;
//import entities.CurrencyConverter;

import entities.CurrencyConverter;

public class Exercise4Poo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double dollar;
		double priceDollar;
		double amout;
		
		System.out.println("What is the dollar price? ");
		priceDollar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		dollar = sc.nextDouble();
		
		amout = CurrencyConverter.iof(priceDollar, dollar);
		
		System.out.printf("Amount to be paid in reais = %.2f", amout);
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
