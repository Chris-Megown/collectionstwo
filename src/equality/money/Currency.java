package equality.money;

public class Currency {

	private String symbol;

	public Currency(String symbol) {
		this.symbol = symbol;

	}

	@Override
	public boolean equals(Object obj) {
		
		// Check for null
		if(obj == null) {
			return false;
		}
		
		// Check that obj is a Currency object
		boolean isACurrency = obj instanceof Currency;
		// could have said:
		//  if(!(obj instanceof Currency))
		if (!isACurrency) {
			return false;
		}
		
		// treat it as a Currency object CASTING
		Currency other = (Currency) obj;
		// compare symbols
		return symbol.equals(other.symbol);
		@override
		public String toString() {
			
		}
}
