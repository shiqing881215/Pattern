package StructuralPatterns.Facade;

/**
 * For client, it only interacts with store keeper.
 * @author qshi
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StoreKeeper keeper = new StoreKeeper();
		Goods goods = keeper.getGood("raw");
		Goods goods2 = keeper.getGood("bad");
	}

}
