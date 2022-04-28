package Ex2;

public class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	Stock(String symbol, String name){
		this.symbol = symbol;
		this.name = name;
	}
	public double getChangePrecent(double previousClosingPrice, double currentPrice) {
		this.previousClosingPrice = previousClosingPrice;
		this.currentPrice = currentPrice;
		
		return 100-(100*currentPrice)/previousClosingPrice;
	}
}
