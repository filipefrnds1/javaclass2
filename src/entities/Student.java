package entities;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public double finalGrade() {
		double finalGrade = this.nota1 + this.nota2 + this.nota3;
		return finalGrade;
	}
	
	public void situFinal(double notaFinal) {
		if(notaFinal >= 60.0) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f ", (60 - notaFinal));
			System.out.println("POINTS");
		}
		
	}
		
}
	

