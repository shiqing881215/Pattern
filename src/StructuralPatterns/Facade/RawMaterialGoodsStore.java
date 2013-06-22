package StructuralPatterns.Facade;

public class RawMaterialGoodsStore implements Store {

	@Override
	public Goods getGoods() {
		RawMaterialGoods good = new RawMaterialGoods();
		return good;
	}

}
