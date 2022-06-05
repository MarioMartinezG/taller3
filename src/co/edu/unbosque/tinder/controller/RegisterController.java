package co.edu.unbosque.tinder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import co.edu.unbosque.tinder.model.ProfileModel;
import co.edu.unbosque.tinder.model.UserModel;
import co.edu.unbosque.tinder.view.RegisterView;

public class RegisterController {

	private RegisterView registerView;
	private UserModel userModel;
	private ProfileModel profileModel;

	public RegisterController(RegisterView registerView, UserModel user, ProfileModel profile,
			ArrayList<UserModel> userDB) {
		this.registerView = registerView;
		this.userModel = user;
		this.profileModel = profile;

		this.registerView.getImageBtn().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.setCurrentDirectory(
						new File(System.getProperty("user.home") + System.getProperty("file.separator") + "Downloads"));

				// Filtering supported type of files
				FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "png");
				chooser.addChoosableFileFilter(filter);
				int res = chooser.showSaveDialog(null);

				// If the user clicks on save in JFileChooser
				if (res == JFileChooser.APPROVE_OPTION) {
					File selFile = chooser.getSelectedFile();
					String path = selFile.getAbsolutePath();
					System.out.println(path);
					registerView.showImage(path);
				}
			}

		});

		this.registerView.getLoginBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					String fullName = registerView.getFullNameFld().getText();

					int age;
					try {
						age = Integer.parseInt(registerView.getAgeFld().getText());
					} catch (Exception e1) {
						e1.printStackTrace();
						age = 0;
					}

					String nationality = (String) registerView.getNacionalityCbx().getSelectedItem();
					String city = (String) registerView.getCityCbx().getSelectedItem();
					String gender = (String) registerView.getGenderCbx().getSelectedItem();
					String description = registerView.getDescriptionFld().getText();
					Icon profilePic = registerView.getImageLbl().getIcon();

					String userName = registerView.getUserFld().getText();
					char[] password = registerView.getPasswordFld().getPassword();

					if (registerView.validForm()) {
						profile.setName(fullName);
						profile.setAge(age);
						profile.setNationality(nationality);
						profile.setCity(city);
						profile.setGender(gender);
						profile.setDescription(description);
						profile.setProfilePic(profilePic);						

						if (user.login(userName, password, userDB) != null) {
							registerView.showErrorMessage("That Username is already being used.");
						} else {
							user.setUser(userName);
							user.setPassword(password);
							user.setProfile(profile);

							userModel.createUser(user, userDB);

							registerView.showConfirmationMessage("User created successfully!");
							System.out.println(userDB);
						}
					} else {
						registerView.showErrorMessage("You must fill out all fields to continue");
					}

				} catch (Exception e1) {
					System.out.println("Error inesperado");
					e1.printStackTrace();
				}
			}

		});
	}

}
