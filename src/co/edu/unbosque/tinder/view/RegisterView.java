package co.edu.unbosque.tinder.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RegisterView {
	private JFrame registerView;
	private JTextField fullNameFld;
	private JComboBox<String> nacionalityCbx;
	private JComboBox<String> cityCbx;
	private JTextField ageFld;
	private JComboBox<String> genderCbx;
	private JPasswordField passwordFld;
	private JTextField userFld;
	private JTextField fotoUserLbl;
	private JTextField descriptionFld;
	private JButton loginBtn;

	private String[] NACIONALITY_OPTS = { " ", "Colombiano ", "Chileno ", "Mexicano", "Other" };
	private String[] COUNTRY_OPTS = { " ", "Bogota ", "Cali", "Ciudad de Mexico", "Medelllin", "Puebla",
			"Santiago de Chile ", "Veracruz", "Other" };
	private String[] GENDER_OPTS = { " ", "Female ", "Male ", "Other" };

	public RegisterView() {

		this.registerView = new JFrame();

		JLabel titleLbl = new JLabel("Register ");
		titleLbl.setBounds(40, 20, 420, 30);
		titleLbl.setFont(new Font("Serif", Font.BOLD, 20));
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.registerView.add(titleLbl);

		JLabel fullNombreLbl = new JLabel("Full name:");
		fullNombreLbl.setBounds(10, 70, 130, 20);
		fullNombreLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		fullNombreLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.registerView.add(fullNombreLbl);

		this.fullNameFld = new JTextField();
		this.fullNameFld.setBounds(40, 95, 420, 30);
		this.registerView.add(this.fullNameFld);

		JLabel fotoUserLbl = new JLabel("Foto:");
		fotoUserLbl.setBounds(500, 70, 130, 20);
		fotoUserLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		fotoUserLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.registerView.add(fotoUserLbl);

		this.fotoUserLbl = new JTextField();
		this.fotoUserLbl.setBounds(40, 95, 420, 30);
		this.registerView.add(this.fotoUserLbl);

		JLabel nacionalityLbl = new JLabel("Nacionality:");
		nacionalityLbl.setBounds(40, 130, 90, 20);
		nacionalityLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		nacionalityLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.registerView.add(nacionalityLbl);

		nacionalityCbx = new JComboBox<String>(NACIONALITY_OPTS);
		nacionalityCbx.setBounds(40, 155, 420, 30);
		this.registerView.add(nacionalityCbx);

		JLabel countryLbl = new JLabel("City of residence:");
		countryLbl.setBounds(40, 190, 130, 20);
		countryLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		countryLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.registerView.add(countryLbl);

		cityCbx = new JComboBox<String>(COUNTRY_OPTS);
		cityCbx.setBounds(40, 215, 420, 30);
		this.registerView.add(cityCbx);

		JLabel ageLbl = new JLabel("Age:");
		ageLbl.setBounds(1, 245, 130, 20);
		ageLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		ageLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.registerView.add(ageLbl);

		this.ageFld = new JTextField();
		this.ageFld.setBounds(40, 270, 420, 30);
		this.registerView.add(this.ageFld);

		JLabel genderLbl = new JLabel("Gender:");
		genderLbl.setBounds(5, 300, 130, 20);
		genderLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		genderLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.registerView.add(genderLbl);

		genderCbx = new JComboBox<String>(GENDER_OPTS);
		genderCbx.setBounds(40, 325, 420, 30);
		this.registerView.add(genderCbx);

		JLabel usuarioLbl = new JLabel("Username:");
		usuarioLbl.setBounds(10, 360, 130, 20);
		usuarioLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		usuarioLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.registerView.add(usuarioLbl);

		this.userFld = new JTextField();
		this.userFld.setBounds(40, 380, 420, 30);
		this.registerView.add(this.userFld);

		JLabel passwordLbl = new JLabel("Password:");
		passwordLbl.setBounds(10, 410, 130, 20);
		passwordLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		passwordLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.registerView.add(passwordLbl);

		this.passwordFld = new JPasswordField();
		this.passwordFld.setBounds(40, 435, 420, 30);
		this.registerView.add(this.passwordFld);

		JLabel descriptionLbl = new JLabel("Description:");
		descriptionLbl.setBounds(20, 470, 130, 20);
		descriptionLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		descriptionLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.registerView.add(descriptionLbl);

		this.descriptionFld = new JTextField();
		this.descriptionFld.setBounds(40, 505, 720, 90);
		this.registerView.add(this.descriptionFld);

		this.loginBtn = new JButton("Continue ");
		this.loginBtn.setBounds(400, 610, 350, 40);
		this.registerView.add(this.loginBtn);

		this.registerView.setSize(800, 700);
		this.registerView.setLocationRelativeTo(null);
		this.registerView.setTitle(" Tinder ");
		this.registerView.setLayout(null);
		this.registerView.setVisible(true);

	}

	public void showConfirmationMessage(String message) {
		JOptionPane.showMessageDialog(this.registerView, message, "Information", JOptionPane.INFORMATION_MESSAGE);
		this.registerView.dispose();
	}

	public JTextField getFullNameFld() {
		return fullNameFld;
	}

	public JComboBox<String> getNacionalityCbx() {
		return nacionalityCbx;
	}

	public JComboBox<String> getCityCbx() {
		return cityCbx;
	}

	public JTextField getAgeFld() {
		return ageFld;
	}

	public JComboBox<String> getGenderCbx() {
		return genderCbx;
	}

	public JPasswordField getPasswordFld() {
		return passwordFld;
	}

	public JTextField getUserFld() {
		return userFld;
	}

	public JTextField getDescriptionFld() {
		return descriptionFld;
	}

	public JButton getLoginBtn() {
		return loginBtn;
	}

}
