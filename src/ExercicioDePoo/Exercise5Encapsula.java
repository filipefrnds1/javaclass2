//Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o n�mero da conta, o nome do titular da conta,
//e o valor de dep�sito inicial que o titular depositou ao abrir a conta. Este valor de dep�sito inicial, entretanto, � opcional,
//ou seja: se o titular n�o tiver dinheiro a depositar no momento de abrir sua conta, o dep�sito inicial n�o ser� feito e o saldo
//inicial da conta ser�, naturalmente, zero.

//Importante: uma vez que uma conta ban�ria foi aberta, o n�mero da conta nunca poder� ser alterado. J� o nome do titular pode ser
//alterado (pois uma pessoa pode mudar de nome por ocasi�o de casamento, por exemplo).

//Por fim, o saldo da conta n�o pode ser alterado livremente. � preciso haver um mecanismo para proteger isso. O saldo s� aumenta
//por meio de dep�sitos, e s� diminui por meio de saques. Para cada saque realizado, o banco cobra uma taca de $5.00. Nota: a conta 
//pode ficar com saldo negativo se o saldo n�o for suficiente para realizar o saque e/ou pagar a taxa.

//Voc� deve fazer um programa que realize o cadastro de uma conta, dando op��o para que seja ou n�o informado o valor de dep�sito 
//inicial. Em seguida, realizar um dep�sito e depois um saque, sempre mostrando os dados da conta ap�s cada opera��o.


package ExercicioDePoo;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Exercise5Encapsula {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroConta;
		String nome;
		double valorConta;
		char simounao;
		Banco banco;
		
		double deposito;
		double saque;
		
		System.out.println("Enter account number: ");
		numeroConta = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		sc.nextLine();
		nome = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y/n) ? ");
		simounao = sc.next().charAt(0);	
		//System.out.println(simounao);	
		
		if(simounao == 'y') {
			System.out.println("Informe o valor de dep�sito inicial: ");
			valorConta = sc.nextDouble();
			banco = new Banco(numeroConta,nome,valorConta);
		}else {
			banco = new Banco(numeroConta,nome);
		}
		
		System.out.println("Account data: ");
		System.out.println(banco);
		
		System.out.println("Enter a deposit value: ");
		deposito = sc.nextDouble();
		banco.deposito(deposito);
		System.out.println("Update account data: ");
		System.out.println(banco);
		
		System.out.println("Enter a withdraw value: ");
		saque = sc.nextDouble();
		banco.saque(saque);
		System.out.println("Update account data: ");
		System.out.println(banco);
		
		
		
		
		
		
		sc.close();
	}

}
