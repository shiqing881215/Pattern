package BehaviorPatterns.ChainResponsibility;

import java.util.ArrayList;

public class Filter1 extends Sill{
	private int size;
	
	@Override
	public int getSize() {
		return size;
	}
	
	@Override
	public void collect(Matters matters) {
		ArrayList<Gravel> nextLevel = new ArrayList<Gravel>();
		ArrayList<Gravel> gravels = matters.getGravels();
		// If the gravel size is less than the filter size, it will go to the next level which is the super level, until it reaches the base level which is sill
		for (int i = 0; i < gravels.size(); i++) {
			if (gravels.get(i).getSize() < getSize()) {
				nextLevel.add(gravels.get(i));
			}
		}
		Matters nextLevelMatters = new Matters();
		nextLevelMatters.setGravels(nextLevel);
		super.collect(nextLevelMatters);
	}
	
}
