package BehaviorPatterns.Mediator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Test extends JFrame implements ActionListener {

	IMediator med = new Mediator();

	public Test() {
		JPanel panel = new JPanel();
		panel.add(new BtnBook(this, med));
		panel.add(new BtnView(this, med));
		panel.add(new BtnSearch(this, med));
		getContentPane().add(new LblDisplay(med));
		getContentPane().add(panel,"South");
		setSize(400, 400);
		setVisible(true);
	}
	
	/**
	 * Call book/view/search execute method
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Executable exe = (Executable) e.getSource();
		exe.execute();
	}
	
	public static void main(String[] args) {
		new Test();
	}
}
