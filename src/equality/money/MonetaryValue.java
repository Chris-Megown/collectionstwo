package equality.money;

import java.math.BigDecimal;

public class MonetaryValue {

	private BigDecimal amount;
	private Currency currency;
	
	public MonetaryValue(String amount, Currency currency) {
		this.amount = new BigDecimal(amount);
		this.currency = currency;
	}
	
}
