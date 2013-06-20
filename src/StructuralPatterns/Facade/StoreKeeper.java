package StructuralPatterns.Facade;

/**
 * 
 * Facade as the name suggests means the face of the building. 
 * The people walking past the road can only see this glass face of the building. 
 * They do not know anything about it, the wiring, the pipes and other complexities. 
 * The face hides all the complexities of the building and displays a friendly face.
 * 
 * eg: JDBC --- we only call “java.sql.Connection” interface
 * 
 * This is the facade. 
 * It hides all complexity of store and client only needs to contact this store keeper
 * 
 * 
 * http://www.allapplabs.com/java_design_patterns/facade_pattern.htm
 * @author qshi
 *
 */
public class StoreKeeper {
	public Goods getGood(String goodStyle) {
		if (goodStyle.equals("raw")) {
			RawMaterialGoodsStore store = new RawMaterialGoodsStore();
			RawMaterialGoods rawMaterialGood = (RawMaterialGoods) store.getGoods();
			return rawMaterialGood;
		} else if (goodStyle.equals("packaging")) {
			PackagingMaterialGoodsStore store = new PackagingMaterialGoodsStore();
			PackagingMaterialGoods packagingMaterialGood = (PackagingMaterialGoods) store.getGoods();
			return packagingMaterialGood;
		} else if (goodStyle.equals("finish")) {
			FinishedGoodsStore store = new FinishedGoodsStore();
			FinishedGoods finishedGood = (FinishedGoods) store.getGoods();
			return finishedGood;
		} else {
			System.out.println("Sorry, no kind of goods.");
			return null;
		}
	}
}
