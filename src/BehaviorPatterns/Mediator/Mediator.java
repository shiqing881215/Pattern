package BehaviorPatterns.Mediator;

/**
 * Each participant talk to this mediator, and all the logic is completed here.
 * When adding a new participant to the system, only add something here. No need to notify other participants.
 * 
 * http://en.wikipedia.org/wiki/Mediator_pattern
 * 
 * Good example: airplanes interacting with the control tower and not among themselves
 * @author shiqing
 *
 */
public class Mediator implements IMediator {
	private BtnBook btnBook;
	private BtnView btnView;
	private BtnSearch btnSearch;
	private LblDisplay lblDisplay;

	/*
	 * 	These three methods do the real work and invoked by book, view, search in their execute methods
	 */
	
	@Override
	public void book() {
		btnBook.setEnabled(false);
		btnView.setEnabled(true);
		btnSearch.setEnabled(true);
		lblDisplay.setText("Book button is pressed");
	}

	@Override
	public void view() {
		btnView.setEnabled(false);
		btnBook.setEnabled(true);
		btnSearch.setEnabled(true);
		lblDisplay.setText("View button is pressed");
	}

	@Override
	public void search() {
		btnSearch.setEnabled(false);
		btnView.setEnabled(true);
		btnBook.setEnabled(true);
		lblDisplay.setText("Search button is pressed");
	}

	/*
	 * These register function get the real button which takes action 
	 */
	
	@Override
	public void registerBook(BtnBook b) {
		btnBook = b;
	}

	@Override
	public void registerView(BtnView v) {
		btnView = v;
	}

	@Override
	public void registerSearch(BtnSearch s) {
		btnSearch = s;
	}

	@Override
	public void registerDisplay(LblDisplay d) {
		lblDisplay = d;
	}

}
