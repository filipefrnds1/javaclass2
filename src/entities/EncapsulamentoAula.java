package entities;

public class EncapsulamentoAula {
	private String name;
	private double price;
	private double quantity;
	
	public EncapsulamentoAula() {
		
	}
	
	public EncapsulamentoAula(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	

}
