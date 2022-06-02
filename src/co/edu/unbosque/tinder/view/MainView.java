package co.edu.unbosque.tinder.view;

import java.awt.Font;

import javax.swing.*;

public class MainView {
	private JFrame mainView;
	private JTextField userFld;
	private JTextField passwordFld;
	private JButton loginBtn;
	private JButton registarBtn;

	public MainView() {

		this.mainView = new JFrame();

		JLabel titleLbl = new JLabel("Welcome to TINDER ");
		titleLbl.setBounds(40, 20, 420, 30);
		titleLbl.setFont(new Font("Serif", Font.BOLD, 20));
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.mainView.add(titleLbl);

		this.mainView.setSize(500, 290); // JFrame dimensions
		this.mainView.setLocationRelativeTo(null); // Centering JFrame vertically and horizontally
		this.mainView.setTitle(" TINDER"); // Setting the title of the window
		JLabel usuarioLbl = new JLabel("Enter the user:");
		usuarioLbl.setBounds(40, 70, 420, 20);
		usuarioLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		usuarioLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.mainView.add(usuarioLbl);

		this.userFld = new JTextField();
		this.userFld.setBounds(40, 95, 420, 30);
		this.mainView.add(this.userFld);

		JLabel passwordLbl = new JLabel("Enter the password:");
		passwordLbl.setBounds(40, 130, 420, 20);
		passwordLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		passwordLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.mainView.add(passwordLbl);

		this.passwordFld = new JTextField();
		this.passwordFld.setBounds(40, 155, 420, 30);
		this.mainView.add(this.passwordFld);

		this.loginBtn = new JButton("Ingresar");
		this.loginBtn.setBounds(40, 200, 200, 40);
		this.mainView.add(this.loginBtn);

		this.registarBtn = new JButton("Registrarme");
		this.registarBtn.setBounds(260, 200, 200, 40);
		this.mainView.add(this.registarBtn);

		this.mainView.setSize(500, 500);
		this.mainView.setLocationRelativeTo(null);
		this.mainView.setTitle(" Tinder ");
		this.mainView.setLayout(null);
		this.mainView.setVisible(true);

	}

	public void showErrorMessage(String message) {
		JOptionPane.showMessageDialog(this.mainView, message, "Error", JOptionPane.ERROR_MESSAGE);
	}

	public JTextField getUserFld() {
		return userFld;
	}

	public JTextField getPasswordFld() {
		return passwordFld;
	}

	public JButton getLoginBtn() {
		return loginBtn;
	}

	public JButton getRegistarBtn() {
		return registarBtn;
	}
}