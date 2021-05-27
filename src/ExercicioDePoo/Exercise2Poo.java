//Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). Em seguida, mostrar 
//os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, aumentar o sal�rio do funcionpario com base em
//uma porcentagem dada (somente o sal�rio bruto � afetado pela porcentagem) e
//mostrar novamente os dados do funcion�rio

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
		
		System.out.println("Informe o nome do funcion�rio: ");
		employee.name = sc.nextLine();
		
		System.out.println("Informe o Sal�rio Bruto do funcion�rio: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Informe o imposto do sal�rio do funcion�rio: ");
		employee.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f%n", employee.name, employee.netSalary());
		
		System.out.println("Which percentage to increase salary? ");
		percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Update data: " + employee.toString());
		
		
		
		
		
		sc.close();
	}

}
