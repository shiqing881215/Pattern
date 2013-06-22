package StructuralPatterns.Proxy;

/**
 * The proxy pattern is used when you need to represent a complex with a simpler one. 
 * If creation of object is expensive, its creation can be POSTPONED till the very need arises and till then, a simple object can represent it. 
 * This simple object is called the “Proxy” for the complex object
 * 
 * http://www.allapplabs.com/java_design_patterns/proxy_pattern.htm
 * 
 * @author qshi
 * 
 */
public class ATMProxy {
	/**
	 * Method getMoneyForPurchase This method is responsible for the entire
	 * banking operation described in the write-up
	 */
	/*
	public double getMoneyForPurchase(double amountNeeded) {

		// get obj of You to get card
		You you = new You("Prashant");
		// get obj for account
		Account account = new Account();

		boolean isBalanceAvailable = false;
		// if card there, go ahead
		if (you.getCard()) {
			isBalanceAvailable = account.checkBalance(you.getAccountNumber(),
					amountNeeded);
		}

		if (isBalanceAvailable)
			return amountNeeded;
		else
			return 0;
	}
	*/
}
