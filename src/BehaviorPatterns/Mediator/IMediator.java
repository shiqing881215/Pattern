package BehaviorPatterns.Mediator;

public interface IMediator {
	public void book();
	public void view();
	public void search();
	public void registerBook(BtnBook b);
	public void registerView(BtnView v);
	public void registerSearch(BtnSearch s);
	public void registerDisplay(LblDisplay d);
}
