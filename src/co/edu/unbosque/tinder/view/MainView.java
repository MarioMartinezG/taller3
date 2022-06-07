package co.edu.unbosque.tinder.view;

import java.awt.Font;
import java.awt.Image;
import java.net.URL;
import javax.swing.*;

public class MainView {
	private JFrame mainView;
	private JLabel logo;
	private JButton loginBtn;
	private JButton registerBtn;

	public MainView() {
		this.mainView = new JFrame();		

		JLabel titleLbl = new JLabel("TINDER ");
		titleLbl.setBounds(40, 100, 420, 30);
		titleLbl.setFont(new Font("Serif", Font.BOLD, 20));
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.mainView.add(titleLbl);
		
		logo = new JLabel();
		logo.setBounds(140, 150, 200, 200);
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setVisible(true);
		this.mainView.add(logo);
		
		this.loginBtn = new JButton("Login");
		this.loginBtn.setBounds(40, 510, 200, 40);
		this.mainView.add(this.loginBtn);

		this.registerBtn = new JButton("Sign Up");
		this.registerBtn.setBounds(260, 510, 200, 40);
		this.mainView.add(this.registerBtn);

		this.mainView.setSize(500, 600);
		this.mainView.setLocationRelativeTo(null);
		this.mainView.setTitle(" Tinder ");
		this.mainView.setLayout(null);
		this.mainView.setVisible(true);
		this.mainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void showErrorMessage(String message) {
		JOptionPane.showMessageDialog(this.mainView, message, "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	private ImageIcon resize(URL imgPath) {
		ImageIcon path = new ImageIcon(imgPath);
		Image img = path.getImage();
		
		double resizeRatio = (double) this.logo.getWidth() / (double) img.getWidth(null);
		int newWidth = (int) (img.getWidth(null) * resizeRatio);
		int newHeight = (int) (img.getHeight(null) * resizeRatio);
		
		Image newImg = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		return image;
	}
	
	public void showImage(URL path) {
		this.logo.setIcon(resize(path));
	}
	
	public void hideFrame() {
		this.mainView.setVisible(false);
	}
	
	public void showFrame() {
		this.mainView.setVisible(true);
	}

	public JButton getLoginBtn() {
		return loginBtn;
	}

	public JButton getRegisterBtn() {
		return registerBtn;
	}
}
