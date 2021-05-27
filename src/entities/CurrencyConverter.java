package entities;

public class CurrencyConverter {
	
	
	public static double iof = 0.06;
	
	public static double iof(double priceDolar, double dollar) {
		return dollar = (dollar * priceDolar) + ((dollar * priceDolar) * iof);
		
	}
	
}
