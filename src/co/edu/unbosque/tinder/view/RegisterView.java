package co.edu.unbosque.tinder.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RegisterView {
	private JFrame mainView;
	private JTextField fullNombreLbl;
	private JTextField nacionalityLbl;
	private JTextField countryLbl;
	private JTextField ageLbl;
	private JTextField genderLbl;
	private JTextField descriptionLbl;
	private JButton loginBtn;
	
	private String[] NACIONALITY_OPTS = { "Colombiano ", "Chileno ", "Mexicano", "Otro" };
	private String[] COUNTRY_OPTS = { "Bogota ","Ciudad de Mexico", "Cali", "Medelllin", "Puebla", "Santiago de Chile ", "Veracruz", "Otro" };
	private String[] GENDER_OPTS = { "Female ", "Male ", "Oter" };

	public RegisterView() {

		this.mainView = new JFrame();

		JLabel titleLbl = new JLabel("Register ");
		titleLbl.setBounds(40, 20, 420, 30);
		titleLbl.setFont(new Font("Serif", Font.BOLD, 20));
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.mainView.add(titleLbl);

		this.mainView.setSize(500, 290); // JFrame dimensions
		this.mainView.setLocationRelativeTo(null); // Centering JFrame vertically and horizontally
		this.mainView.setTitle(" TINDER"); // Setting the title of the window
		
		JLabel fullNombreLbl = new JLabel("Full name:");
		fullNombreLbl.setBounds(10, 70, 130, 20);
		fullNombreLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		fullNombreLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.mainView.add(fullNombreLbl);

		this.fullNombreLbl = new JTextField();
		this.fullNombreLbl.setBounds(40, 95, 420, 30);
		this.mainView.add(this.fullNombreLbl);
		
		JLabel nacionalityLbl = new JLabel("Nacionality:");
		nacionalityLbl.setBounds(40, 130, 90, 20);
		nacionalityLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		nacionalityLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.mainView.add(nacionalityLbl);

		this.nacionalityLbl = new JTextField();
		this.nacionalityLbl.setBounds(40, 155, 420, 30);
		this.mainView.add(this.nacionalityLbl);
		
		
		JComboBox<String> nacionalityCbx = new JComboBox<String>(NACIONALITY_OPTS);
		nacionalityCbx.setBounds(40, 100, 420, 20);
		this.mainView.add(nacionalityCbx);
		
		
		JLabel countryLbl = new JLabel("Country:");
		countryLbl.setBounds(5, 190, 130, 20);
		countryLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		countryLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.mainView.add(countryLbl);

		this.countryLbl = new JTextField();
		this.countryLbl.setBounds(40, 215, 420, 30);
		this.mainView.add(this.countryLbl);
		
		JLabel ageLbl = new JLabel("Age:");
		ageLbl.setBounds(1, 245, 130, 20);
		ageLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		ageLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.mainView.add(ageLbl);

		this.ageLbl = new JTextField();
		this.ageLbl.setBounds(40, 270, 420, 30);
		this.mainView.add(this.ageLbl);
		
		JLabel genderLbl = new JLabel("Gender:");
		genderLbl.setBounds(5, 300, 130, 20);
		genderLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		genderLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.mainView.add(genderLbl);

		this.genderLbl = new JTextField();
		this.genderLbl.setBounds(40, 325, 420, 30);
		this.mainView.add(this.genderLbl);
		
		JLabel descriptionLbl = new JLabel("Description:");
		descriptionLbl.setBounds(20, 370, 130, 20);
		descriptionLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		descriptionLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.mainView.add(descriptionLbl);

		this.descriptionLbl = new JTextField();
		this.descriptionLbl.setBounds(40, 405, 420, 90);
		this.mainView.add(this.descriptionLbl);
	
		this.loginBtn = new JButton("Continue ");
		this.loginBtn.setBounds(220, 510, 250, 40);
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

	public String[] getNACIONALITY_OPTS() {
		return NACIONALITY_OPTS;
	}

	public void setNACIONALITY_OPTS(String[] nACIONALITY_OPTS) {
		NACIONALITY_OPTS = nACIONALITY_OPTS;
	}

	public String[] getCOUNTRY_OPTS() {
		return COUNTRY_OPTS;
	}

	public void setCOUNTRY_OPTS(String[] cOUNTRY_OPTS) {
		COUNTRY_OPTS = cOUNTRY_OPTS;
	}

	public String[] getGENDER_OPTS() {
		return GENDER_OPTS;
	}

	public void setGENDER_OPTS(String[] gENDER_OPTS) {
		GENDER_OPTS = gENDER_OPTS;
	}
}
	
