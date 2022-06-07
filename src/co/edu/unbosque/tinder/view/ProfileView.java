package co.edu.unbosque.tinder.view;

import java.awt.Font;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import co.edu.unbosque.tinder.model.UserModel;

public class ProfileView {
	private JFrame profileView;
	private JButton returnBtn;
	private JLabel profilePicLbl;
	private JLabel nameLbl;
	private JLabel ageLbl;
	private JLabel nationalityLbl;
	private JLabel cityLbl;
	private JLabel genderLbl;
	private JLabel descriptionLbl;
	private JButton likeBtn;
	private JButton dislikeBtn;
	private JButton previousBtn;
	private JButton nextBtn;

	public ProfileView() {
		this.profileView = new JFrame();

		JLabel optionLbl = new JLabel("Match with people");
		optionLbl.setBounds(300, 20, 200, 30);
		optionLbl.setFont(new Font("Serif", Font.BOLD, 20));
		optionLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.profileView.add(optionLbl);

		this.returnBtn = new JButton("Return to Menu");
		this.returnBtn.setBounds(30, 20, 150, 40);
		this.profileView.add(returnBtn);

		this.profilePicLbl = new JLabel();
		this.profilePicLbl.setBounds(40, 80, 200, 200);
		this.profileView.add(this.profilePicLbl);

		this.nameLbl = new JLabel();
		this.nameLbl.setBounds(250, 60, 300, 20);
		this.nameLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		this.profileView.add(this.nameLbl);

		this.ageLbl = new JLabel();
		this.ageLbl.setBounds(250, 100, 200, 20);
		this.ageLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		this.profileView.add(this.ageLbl);

		this.nationalityLbl = new JLabel();
		this.nationalityLbl.setBounds(250, 120, 200, 20);
		this.nationalityLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		this.profileView.add(this.nationalityLbl);

		this.cityLbl = new JLabel();
		this.cityLbl.setBounds(250, 140, 200, 20);
		this.cityLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		this.profileView.add(this.cityLbl);

		this.genderLbl = new JLabel();
		this.genderLbl.setBounds(250, 160, 200, 20);
		this.genderLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		this.profileView.add(this.genderLbl);

		this.descriptionLbl = new JLabel();
		this.descriptionLbl.setBounds(250, 180, 200, 20);
		this.descriptionLbl.setFont(new Font("Serif", Font.PLAIN, 16));
		this.profileView.add(this.descriptionLbl);

		this.dislikeBtn = new JButton("Dislike user");
		this.dislikeBtn.setBounds(250, 240, 200, 40);
		this.profileView.add(this.dislikeBtn);

		this.likeBtn = new JButton("Like user");
		this.likeBtn.setBounds(450, 240, 200, 40);
		this.profileView.add(this.likeBtn);
		
		this.previousBtn = new JButton("Previous");
		this.previousBtn.setBounds(700, 145, 70, 40);
		this.profileView.add(previousBtn);

		this.nextBtn = new JButton("Next");
		this.nextBtn.setBounds(700, 105, 70, 40);
		this.profileView.add(nextBtn);

		this.profileView.setSize(800, 350);
		this.profileView.setLocationRelativeTo(null);
		this.profileView.setTitle(" Tinder ");
		this.profileView.setLayout(null);
		this.profileView.setVisible(true);
	}

	public Image getImageFromFS(String filename) {
		try {
			return ImageIO.read(getClass().getResourceAsStream("/" + filename));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void setUserValues(UserModel user) {
		try {
			if (user.getProfile().getProfilePic() == null) {
				String path = user.getProfile().getDummyProfPic();
				ImageIcon imgIcon = new ImageIcon(this.getImageFromFS(path));
				this.getProfilePicLbl().setIcon(imgIcon);
			} else {
				this.getProfilePicLbl().setIcon(user.getProfile().getProfilePic());
			}
		} catch (Exception e) {
			System.out.println("Oops!!! Cannot load image");
		}

		this.getNameLbl().setText("Name: " + user.getProfile().getName());
		this.getAgeLbl().setText("Age: " + Integer.toString(user.getProfile().getAge()));
		this.getNationalityLbl().setText("Nationality: " + user.getProfile().getNationality());
		this.getCityLbl().setText("City of residence: " + user.getProfile().getCity());
		this.getGenderLbl().setText("Gender: " + user.getProfile().getGender());
		this.getDescriptionLbl().setText("Description: " + user.getProfile().getDescription());
	}

	public void hideFrame() {
		this.profileView.setVisible(false);
		;
	}

	public void showFrame() {
		this.profileView.setVisible(true);
	}

	public JFrame getProfileView() {
		return profileView;
	}

	public JButton getReturnBtn() {
		return returnBtn;
	}

	public JLabel getProfilePicLbl() {
		return profilePicLbl;
	}

	public JLabel getNameLbl() {
		return nameLbl;
	}

	public JLabel getAgeLbl() {
		return ageLbl;
	}

	public JLabel getNationalityLbl() {
		return nationalityLbl;
	}

	public JLabel getCityLbl() {
		return cityLbl;
	}

	public JLabel getGenderLbl() {
		return genderLbl;
	}

	public JLabel getDescriptionLbl() {
		return descriptionLbl;
	}

	public JButton getLikeBtn() {
		return likeBtn;
	}

	public JButton getDislikeBtn() {
		return dislikeBtn;
	}

	public JButton getPreviousBtn() {
		return previousBtn;
	}

	public JButton getNextBtn() {
		return nextBtn;
	}

}
