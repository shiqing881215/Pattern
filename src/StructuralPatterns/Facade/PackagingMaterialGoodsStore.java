package StructuralPatterns.Facade;

public class PackagingMaterialGoodsStore implements Store {

	@Override
	public Goods getGoods() {
		PackagingMaterialGoods good = new PackagingMaterialGoods();
		return good;
	}

}
