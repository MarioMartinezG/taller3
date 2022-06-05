package co.edu.unbosque.tinder.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PreferenceView {
	private JFrame preferenceView;
	private JTextField minAgeFld;
	private JTextField maxAgeFld;
	private JComboBox<String> genderCbx;
	private JComboBox<String> cityCbx;
	private JButton saveBtn;
	private JButton returnBtn;
	
	private String[] COUNTRY_OPTS = { " ", "Bogota ", "Cali", "Ciudad de Mexico", "Medelllin", "Puebla",
			"Santiago de Chile ", "Veracruz", "Other" };
	private String[] GENDER_OPTS = { " ", "Female ", "Male ", "Other" };
	
	public PreferenceView() {
		this.preferenceView = new JFrame();
		
		JLabel preferenceLbl = new JLabel("Set your preferences");
		preferenceLbl.setBounds(300, 20, 200, 30);
		preferenceLbl.setFont(new Font("Serif", Font.BOLD, 20));
		preferenceLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.preferenceView.add(preferenceLbl);
		
		JLabel minAgeLbl = new JLabel("Minimum age:");
		minAgeLbl.setBounds(10, 70, 130, 20);
		minAgeLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		minAgeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.preferenceView.add(minAgeLbl);
				
		this.minAgeFld = new JTextField();
		this.minAgeFld.setBounds(35, 95, 210, 30);
		this.preferenceView.add(minAgeFld);
		
		JLabel maxAgeLbl = new JLabel("Maximum age:");
		maxAgeLbl.setBounds(500, 70, 130, 20);
		maxAgeLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		maxAgeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.preferenceView.add(maxAgeLbl);
		
		this.maxAgeFld = new JTextField();
		this.maxAgeFld.setBounds(525, 95, 210, 30);
		this.preferenceView.add(maxAgeFld);
		
		JLabel genderLbl = new JLabel("Gender");
		genderLbl.setBounds(10, 130, 90, 20);
		genderLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		genderLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.preferenceView.add(genderLbl);
		
		this.genderCbx = new JComboBox<String>(GENDER_OPTS);
		this.genderCbx.setBounds(35, 150, 700, 30);
		this.preferenceView.add(this.genderCbx);
		
		JLabel cityLbl = new JLabel("City of residence");
		cityLbl.setBounds(20, 185, 130, 20);
		cityLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		cityLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.preferenceView.add(cityLbl);
		
		this.cityCbx = new JComboBox<String>(COUNTRY_OPTS);
		this.cityCbx.setBounds(35, 205, 700, 30);
		this.preferenceView.add(this.cityCbx);
		
		this.saveBtn = new JButton("Save preferences");
		this.saveBtn.setBounds(35, 250, 300, 40);
		this.preferenceView.add(this.saveBtn);
		
		this.returnBtn = new JButton("Return");
		this.returnBtn.setBounds(435, 250, 300, 40);
		this.preferenceView.add(this.returnBtn);
		
		this.preferenceView.setSize(800, 400);
		this.preferenceView.setLocationRelativeTo(null);
		this.preferenceView.setTitle(" Tinder ");
		this.preferenceView.setLayout(null);
		this.preferenceView.setVisible(true);
		
	}
	
	public void showConfirmationMessage(String message) {
		JOptionPane.showMessageDialog(this.preferenceView, message, "Information", JOptionPane.INFORMATION_MESSAGE);
		this.preferenceView.dispose();
	}
	
	public void showErrorMessage(String message) {
		JOptionPane.showMessageDialog(this.preferenceView, message, "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	public void hideFrame() {
		this.preferenceView.setVisible(false);
	}
	
	public void showFrame() {
		this.preferenceView.setVisible(true);
	}

	public JFrame getPreferenceView() {
		return preferenceView;
	}

	public JTextField getMinAgeFld() {
		return minAgeFld;
	}

	public JTextField getMaxAgeFld() {
		return maxAgeFld;
	}

	public JComboBox<String> getGenderCbx() {
		return genderCbx;
	}

	public JComboBox<String> getCityCbx() {
		return cityCbx;
	}

	public JButton getSaveBtn() {
		return saveBtn;
	}

	public JButton getReturnBtn() {
		return returnBtn;
	}
}
