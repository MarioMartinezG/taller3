package co.edu.unbosque.tinder.view;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainView {

	private JFrame mainView;
	
	public MainView() {
	this.mainView = new JFrame();
	
	JLabel titleLbl = new JLabel("Welcome to TINDER ");
	titleLbl.setBounds(40, 20, 420, 30);
	titleLbl.setFont(new Font("Serif", Font.BOLD, 20));
	titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
	this.mainView.add(titleLbl);
	}
}
