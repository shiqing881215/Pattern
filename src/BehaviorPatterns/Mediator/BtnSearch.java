package BehaviorPatterns.Mediator;

import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class BtnSearch extends JButton implements Executable {

	IMediator med;
	
	public BtnSearch(ActionListener al, IMediator m) {
		super("Search");
		addActionListener(al);
		med = m;
		med.registerSearch(this);
	}
	
	@Override
	public void execute() {
		med.search();
	}

}
