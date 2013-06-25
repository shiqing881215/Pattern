package BehaviorPatterns.Mediator;

import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class BtnView extends JButton implements Executable {

	// Need to talk to this guy, instead of other participant(book, search)
	IMediator med;
	
	public BtnView(ActionListener al, IMediator m) {
		super("View");
		addActionListener(al);
		med = m;
		med.registerView(this);
	}
	
	/**
	 * All the real work is done by mediator.
	 */
	@Override
	public void execute() {
		med.view();
	}

}
