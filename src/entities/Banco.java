package entities;

	
public class Banco {

	private int numeroConta;
	private String nome;
	private double valorConta;
	
	public Banco(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}
	
	public Banco(int numeroConta, String nome, double valorConta) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		deposito(valorConta);	
	}
			
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getValorConta() {
		return valorConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void deposito(double deposito) {
		this.valorConta = this.valorConta + deposito;
	}
	
	public void saque(double saque) {
		this.valorConta = this.valorConta - (saque + 5.0);
			
	}
	
	public String toString() {
		return "Account "
					+ numeroConta
					+ ", Holder: "
					+ nome
					+ ", Balance: $ "
					+ String.format("%.2f ", valorConta); // não é 2.f é .2f 
				
	}
	
}
