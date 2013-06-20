package StructuralPatterns.Facade;

public class RawMaterialGoods implements Goods {

	@Override
	public void getDescription() {
		System.out.println("This is raw material goods.");
	}

}
