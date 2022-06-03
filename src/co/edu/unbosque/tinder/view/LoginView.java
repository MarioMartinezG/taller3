package co.edu.unbosque.tinder.view;
import java.awt.Font;

import javax.swing.*;

public class LoginView {
	private JFrame mainView;
	private JTextField userFld;
	private JTextField passwordFld;
	private JButton loginBtn;
	private JButton registerBtn;

	public LoginView() {

		this.mainView = new JFrame();

		JLabel titleLbl = new JLabel("Welcome to TINDER ");
		titleLbl.setBounds(40, 20, 420, 30);
		titleLbl.setFont(new Font("Serif", Font.BOLD, 20));
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.mainView.add(titleLbl);

		this.mainView.setSize(500, 290); 
		this.mainView.setLocationRelativeTo(null); 
		this.mainView.setTitle(" TINDER");
		JLabel usuarioLbl = new JLabel("Username:");
		usuarioLbl.setBounds(10, 70, 130, 20);
		usuarioLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		usuarioLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.mainView.add(usuarioLbl);

		this.userFld = new JTextField();
		this.userFld.setBounds(40, 95, 420, 30);
		this.mainView.add(this.userFld);

		JLabel passwordLbl = new JLabel("Password:");
		passwordLbl.setBounds(40, 130, 70, 20);
		passwordLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		passwordLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.mainView.add(passwordLbl);

		this.passwordFld = new JTextField();
		this.passwordFld.setBounds(40, 155, 420, 30);
		this.mainView.add(this.passwordFld);

		this.loginBtn = new JButton("Iniciar Sesión");
		this.loginBtn.setBounds(120, 210, 250, 40);
		this.mainView.add(this.loginBtn);

		this.mainView.setSize(500, 600);
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
		return registerBtn;
	}
}
