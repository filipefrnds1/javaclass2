//Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar 
//os dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionpario com base em
//uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e
//mostrar novamente os dados do funcionário

package ExercicioDePoo;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Exercise2Poo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double percentage;
		Employee employee = new Employee();
		
		System.out.println("Informe o nome do funcionário: ");
		employee.name = sc.nextLine();
		
		System.out.println("Informe o Salário Bruto do funcionário: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Informe o imposto do salário do funcionário: ");
		employee.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f%n", employee.name, employee.netSalary());
		
		System.out.println("Which percentage to increase salary? ");
		percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Update data: " + employee.toString());
		
		
		
		
		
		sc.close();
	}

}
