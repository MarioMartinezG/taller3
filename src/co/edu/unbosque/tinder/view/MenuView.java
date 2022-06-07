package co.edu.unbosque.tinder.view;

import java.awt.Font;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import co.edu.unbosque.tinder.model.UserModel;

public class MenuView {
	private JFrame menuView;
	private JLabel profilePicLbl;
	private JButton preferenceBtn;
	private JButton matchBtn;
	private JButton seeMatchBtn;
	private JButton logOutBtn;

	public MenuView(UserModel loggedUser) {
		this.menuView = new JFrame();

		JLabel optionLbl = new JLabel("Main Menu");
		optionLbl.setBounds(400, 20, 100, 30);
		optionLbl.setFont(new Font("Serif", Font.BOLD, 20));
		optionLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.menuView.add(optionLbl);

		profilePicLbl = new JLabel();
		profilePicLbl.setBounds(40, 60, 200, 200);
		this.menuView.add(profilePicLbl);

		JLabel nameLbl = new JLabel("Full name: " + loggedUser.getProfile().getName());
		nameLbl.setBounds(250, 60, 300, 20);
		nameLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		this.menuView.add(nameLbl);

		JLabel genderLbl = new JLabel("Gender: " + loggedUser.getProfile().getGender());
		genderLbl.setBounds(250, 80, 200, 20);
		genderLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		this.menuView.add(genderLbl);

		JLabel ageLbl = new JLabel("Age: " + String.valueOf(loggedUser.getProfile().getAge()));
		ageLbl.setBounds(250, 100, 200, 20);
		ageLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		this.menuView.add(ageLbl);

		JLabel cityLbl = new JLabel("Located in: " + loggedUser.getProfile().getCity());
		cityLbl.setBounds(250, 120, 200, 20);
		cityLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		this.menuView.add(cityLbl);

		this.preferenceBtn = new JButton("See Preferences");
		this.preferenceBtn.setBounds(250, 150, 200, 40);
		this.menuView.add(preferenceBtn);

		this.matchBtn = new JButton("Match with people");
		this.matchBtn.setBounds(450, 150, 200, 40);
		this.menuView.add(this.matchBtn);

		this.seeMatchBtn = new JButton("See my Matches");
		this.seeMatchBtn.setBounds(250, 200, 200, 40);
		this.menuView.add(this.seeMatchBtn);

		this.logOutBtn = new JButton("Log Out");
		this.logOutBtn.setBounds(450, 200, 200, 40);
		this.menuView.add(this.logOutBtn);

		this.menuView.setSize(800, 350);
		this.menuView.setLocationRelativeTo(null);
		this.menuView.setTitle(" Tinder ");
		this.menuView.setLayout(null);
		this.menuView.setVisible(true);
	}

	public void hideFrame() {
		this.menuView.setVisible(false);
		;
	}

	public void showFrame() {
		this.menuView.setVisible(true);
	}
	
	public Image getImageFromFS(String filename) {
		try {
			return ImageIO.read(getClass().getResourceAsStream("/"+ filename));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * @return the profilePicLbl
	 */
	public JLabel getProfilePicLbl() {
		return profilePicLbl;
	}

	public JButton getPreferenceBtn() {
		return preferenceBtn;
	}

	public JButton getMatchBtn() {
		return matchBtn;
	}

	public JButton getSeeMatchBtn() {
		return seeMatchBtn;
	}

	public JButton getLogOutBtn() {
		return logOutBtn;
	}

}
