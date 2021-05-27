package entities;

public class Esfera {
	
	public double radius;
	public double pi = 3.14;
	public double circumference;
	public double volume;
	
	public double circumference() {
		this.circumference = 2 * this.pi * this.radius;
		return this.circumference;
	}
	
	public double volume() {
		this.volume = (4 * this.pi * Math.pow(this.radius, 3)) / 3;
		return this.volume;
	}

}
