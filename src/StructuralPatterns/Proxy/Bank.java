package StructuralPatterns.Proxy;

/**
 * Do NOT pay attention to the details of bank.
 * Just keep in mind that if you want to get some cash in the bank,
 * it will be a complex progress.
 * And at this point ATM and check can be the proxy for this stupid process
 * @author qshi
 *
 */
public class Bank {
	private int numberInQueue;

	/**
	 * Method getMoneyForPurchase This method is responsible for the entire
	 * banking operation described in the write-up
	 */
	/*
	public double getMoneyForPurchase(double amountNeeded) {

		// get object for person
		You you = new You("Prashant");
		// get obj for account
		Account account = new Account();
		// get person's account number
		String accountNumber = you.getAccountNumber();
		// passbook got.
		boolean gotPassbook = you.getPassbook();
		// get number in queue
		int number = getNumberInQueue();

		// the number will decrease every few mins
		while (number != 0) {
			number--;
		}

		// now when the number = 0, check if balance is sufficient
		boolean isBalanceSufficient = account.checkBalance(accountNumber,
				amountNeeded);

		if (isBalanceSufficient)
			return amountNeeded;
		else
			return 0;
	}
*/
	/**
	 * returns the number in the queue
	 */
	private int getNumberInQueue() {
		return numberInQueue;
	}

}
