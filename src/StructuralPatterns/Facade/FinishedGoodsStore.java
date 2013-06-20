package StructuralPatterns.Facade;

public class FinishedGoodsStore implements Store {

	@Override
	public Goods getGoods() {
		FinishedGoods good = new FinishedGoods();
		return good;
	}

}
