package co.edu.unbosque.tinder.view;

import java.awt.Font;

import javax.swing.*;

public class MainView {
	private JFrame mainView;

	private JButton loginBtn;
	private JButton registarBtn;

	public MainView() {

		this.mainView = new JFrame();

		JLabel titleLbl = new JLabel("TINDER ");
		titleLbl.setBounds(40, 100, 420, 30);
		titleLbl.setFont(new Font("Serif", Font.BOLD, 20));
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.mainView.add(titleLbl);

		this.mainView.setSize(500, 290);
		this.mainView.setLocationRelativeTo(null);
		this.mainView.setTitle(" TINDER");

		this.loginBtn = new JButton("Login");
		this.loginBtn.setBounds(40, 510, 200, 40);
		this.mainView.add(this.loginBtn);

		this.registarBtn = new JButton("Sign Up");
		this.registarBtn.setBounds(260, 510, 200, 40);
		this.mainView.add(this.registarBtn);

		this.mainView.setSize(500, 600);
		this.mainView.setLocationRelativeTo(null);
		this.mainView.setTitle(" Tinder ");
		this.mainView.setLayout(null);
		this.mainView.setVisible(true);

	}

	public void showErrorMessage(String message) {
		JOptionPane.showMessageDialog(this.mainView, message, "Error", JOptionPane.ERROR_MESSAGE);
	}

	public JButton getLoginBtn() {
		return loginBtn;
	}

	public JButton getRegistarBtn() {
		return registarBtn;
	}
}
