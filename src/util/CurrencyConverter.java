package util;

public class CurrencyConverter {
	
	
	public static double ConvertedValue(double price, double withdraw)
	{		
		double tax = price * withdraw * 0.06;
		return price * withdraw + tax;
	}
}
