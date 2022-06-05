package co.edu.unbosque.tinder.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import co.edu.unbosque.tinder.model.UserModel;

public class MenuView {
	private JFrame menuView;
	private JButton preferenceBtn;
	private JButton matchBtn;
	private JButton logOutBtn;
	private JButton seeMatchBtn;

	public MenuView() {
		// TODO Auto-generated constructor stub
	}

	public MenuView(UserModel loggedUser) {
		// TODO Auto-generated constructor stub
		this.menuView = new JFrame();
		
		JLabel optionLbl = new JLabel("Select an option:");
		optionLbl.setBounds(40, 20, 420, 30);
		optionLbl.setFont(new Font("Serif", Font.BOLD, 20));
		optionLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.menuView.add(optionLbl);
		
		this.menuView.setSize(800, 700);
		this.menuView.setLocationRelativeTo(null);
		this.menuView.setTitle(" Tinder ");
		this.menuView.setLayout(null);
		this.menuView.setVisible(true);
		
		
	}

}
