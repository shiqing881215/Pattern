package CreationalPatterns.Prototype;

public class Test {

	public static void main(String[] args) {
		Cell cell = new Cell("Original");
		Cell cloneCell = (Cell) cell.split();
		cloneCell.say();
	}

}
