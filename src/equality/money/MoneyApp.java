package equality.money;

public class MoneyApp {

	public static void main(String[] args) {

	Currency dollars = new Currency("$");
	Currency anotherDollars = new Currency("$");
	
	
	System.out.println("dollars equal? " + dollars.equals(anotherDollars));
	
	Currency pounds = new Currency("British Pounds");
	
	System.out.println("dollars equal pounds? " + dollars.equals(pounds));
	
	MonetaryValue value1 = new MonetaryValue("42.00", dollars);
	
	
	}
}
