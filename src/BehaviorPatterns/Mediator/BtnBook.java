package BehaviorPatterns.Mediator;

import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class BtnBook extends JButton implements Executable {

	IMediator med;
	
	public BtnBook(ActionListener al, IMediator m) {
		super("Book");
		addActionListener(al);
		med = m;
		med.registerBook(this);
	}
	
	@Override
	public void execute() {
		med.book();
	}

}
