package ExercicioDePoo;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Exercise3Poo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		Student aluno = new Student();
		double notafinal;
		
		System.out.println("Informe o nome do aluno: ");
		aluno.name = sc.nextLine();
		
		System.out.println("Informe a primeira nota do aluno: ");
		aluno.nota1 = sc.nextDouble();		
		while( aluno.nota1 < 0 && aluno.nota1 > 30.0) {
			System.out.println("Nota inválida");
			aluno.nota1 = sc.nextDouble();
		};
		
		System.out.println("Informe a segunda nota do aluno: ");
		aluno.nota2 = sc.nextDouble();		
		while( aluno.nota2 < 0 && aluno.nota2 > 35.0) {
			System.out.println("Nota inválida");
			aluno.nota2 = sc.nextDouble();
		};
		
		System.out.println("Informe a terceira nota do aluno: ");
		aluno.nota3 = sc.nextDouble();
		while( aluno.nota3 < 0 && aluno.nota3 > 35.0) {
			System.out.println("Nota inválida");
			aluno.nota3 = sc.nextDouble();
		};
		
		notafinal = aluno.finalGrade();
		
		System.out.println("FINAL GRADE = " + notafinal);
		aluno.situFinal(notafinal);
		
		
		
		
		
		sc.close();
	}

}
