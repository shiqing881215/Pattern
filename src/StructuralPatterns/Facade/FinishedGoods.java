package StructuralPatterns.Facade;

public class FinishedGoods implements Goods {

	@Override
	public void getDescription() {
		System.out.println("This is finished goods.");
	}

}
