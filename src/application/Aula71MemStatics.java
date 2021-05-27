//Membros est�ticos
// Tamb�m chamados membros de classe
// Em oposi��o a membros e inst�ncia
// S�o Membros que fazem sentido independentemente de objetos.
// N�o precisam de objeto para serem chamados. S�o chamados a partir do pr�prio nome da classe.
// Aplica��o comuns:
// classes utilit�rias --> Math.sqrt(double)
// declara��o de constantes
// Uma classe que possui somente membros est�ticos, podem ser uma classe est�tica tamb�m. Esta classe n�o poder�
//ser inst�nciada.
// circunferencia = 2*pi*raio
// volume da esfera = (4*pi*raio^3)/3

package application;

import java.util.Locale;
import java.util.Scanner;
//import entities.Esfera;
import entities.EsferaNew;

public class Aula71MemStatics {
	
	public static final double PI = 3.14159; //final transformar a variavel em uma CONSTANTE
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		//1� MODO
		/*double radius;
		double pi = 3.14;
		double circumference;
		double volume;
		
		System.out.printf("Enter radius: ");
		radius = sc.nextDouble();
		
		
		circumference = 2*pi*radius;
		volume = (4*pi*Math.pow(radius, 3))/3;
		
		System.out.printf("Circumference: %.2f%n", circumference);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("PI value: %.2f", pi);*/
		
		//2� MODO
		/*Esfera esfera = new Esfera();
		
		System.out.printf("Enter radius: ");
		esfera.radius = sc.nextDouble();
		
		System.out.printf("Circumference: %.2f%n", esfera.circumference());
		System.out.printf("Volume: %.2f%n", esfera.volume());
		System.out.printf("PI value: %.2f", esfera.pi);*/
		
		//3� MODO
		
		/*System.out.printf("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n",c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f", PI);*/
		
		/*EsferaNew calc = new EsferaNew();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n",c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f", calc.PI);*/
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = EsferaNew.circumference(radius);
		
		double v = EsferaNew.volume(radius);
		
		System.out.printf("Circumference: %.2f%n",c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f", EsferaNew.PI);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
	public static double circumference(double radius) { // Obs: se apagar o static o metodo main nao vai reconhecer a fun��o
		return 2.0 * PI * radius;						// dentro de uma classe com metodo statico nao pode chamar outro metodo
														// que n�o seja static
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}


}
