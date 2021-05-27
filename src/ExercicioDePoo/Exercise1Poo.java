// Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida,
// mostrar na tela o valor de sua área, perímetro e diagonal. 
// Usar uma classe como mostrado no projeto ao lado.

package ExercicioDePoo;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Exercise1Poo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle);
		
		
		
		sc.close();
	}

}
