package BehaviorPatterns.Mediator;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class LblDisplay extends JLabel {
	private IMediator med;
	
	public LblDisplay(IMediator m) {
		super("Just start");
		med = m;
		med.registerDisplay(this);
	}

}
