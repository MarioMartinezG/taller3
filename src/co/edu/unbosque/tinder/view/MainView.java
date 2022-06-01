package co.edu.unbosque.tinder.view;

import java.awt.Component;
import java.awt.Font;

import javax.swing.*;

public class MainView {
	
	private JFrame mainView;
	private JButton registarBtn;
	
	
	public MainView() {

		this.mainView = new JFrame();
		

		JLabel titleLbl = new JLabel("Welcome to TINDER ");
		titleLbl.setBounds(40, 20, 420, 30);
		titleLbl.setFont(new Font("Serif", Font.BOLD, 20));
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.mainView.add(titleLbl);
		
		JLabel usuarioLbl = new JLabel("Enter the user:");
		usuarioLbl.setBounds(40, 70, 420, 20);
		usuarioLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		usuarioLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.mainView.add(usuarioLbl);
		
		JTextField user1 = new JTextField();
		user1.setBounds(40, 95, 420, 30);
		this.mainView.add(user1);
		
		JLabel contraseņaLbl = new JLabel("Enter the password:");
		contraseņaLbl.setBounds(40, 130, 420, 20);
		contraseņaLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		contraseņaLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.mainView.add(contraseņaLbl);
		
		JTextField contraseņa = new JTextField();
		contraseņa.setBounds(40, 155, 420, 30);
		this.mainView.add(contraseņa);
		
		this.registarBtn = new JButton("Registrarme");
		this.registarBtn.setBounds(40, 200, 420, 40);
		this.mainView.add(this.registarBtn);
		
		this.mainView.setSize(500, 500); 
		this.mainView.setLocationRelativeTo(null); 
		this.mainView.setTitle(" Tinder "); 
		this.mainView.setLayout(null);
		this.mainView.setVisible(true);
		
		
	}

}
