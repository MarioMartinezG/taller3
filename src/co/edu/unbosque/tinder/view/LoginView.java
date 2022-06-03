package co.edu.unbosque.tinder.view;
import java.awt.Font;

import javax.swing.*;

public class LoginView {
	private JFrame loginView;
	private JTextField userFld;
	private JPasswordField passwordFld;
	private JButton loginBtn;
	private JButton registerBtn;

	public LoginView() {

		this.loginView = new JFrame();

		JLabel titleLbl = new JLabel("Welcome to TINDER ");
		titleLbl.setBounds(40, 20, 420, 30);
		titleLbl.setFont(new Font("Serif", Font.BOLD, 20));
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.loginView.add(titleLbl);

		this.loginView.setSize(500, 290); 
		this.loginView.setLocationRelativeTo(null); 
		this.loginView.setTitle(" TINDER");
		JLabel usuarioLbl = new JLabel("Username:");
		usuarioLbl.setBounds(10, 70, 130, 20);
		usuarioLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		usuarioLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.loginView.add(usuarioLbl);

		this.userFld = new JTextField();
		this.userFld.setBounds(40, 95, 420, 30);
		this.loginView.add(this.userFld);

		JLabel passwordLbl = new JLabel("Password:");
		passwordLbl.setBounds(40, 130, 70, 20);
		passwordLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		passwordLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.loginView.add(passwordLbl);

		this.passwordFld = new JPasswordField();
		this.passwordFld.setBounds(40, 155, 420, 30);
		this.loginView.add(this.passwordFld);

		this.loginBtn = new JButton("Sign In");
		this.loginBtn.setBounds(120, 210, 250, 40);
		this.loginView.add(this.loginBtn);

		this.loginView.setSize(500, 600);
		this.loginView.setLocationRelativeTo(null);
		this.loginView.setTitle(" Tinder ");
		this.loginView.setLayout(null);
		this.loginView.setVisible(true);

	}

	public void showErrorMessage(String message) {
		JOptionPane.showMessageDialog(this.loginView, message, "Error", JOptionPane.ERROR_MESSAGE);
	}

	public JTextField getUserFld() {
		return userFld;
	}

	public JPasswordField getPasswordFld() {
		return passwordFld;
	}

	public JButton getLoginBtn() {
		return loginBtn;
	}

	public JButton getRegistarBtn() {
		return registerBtn;
	}
}
