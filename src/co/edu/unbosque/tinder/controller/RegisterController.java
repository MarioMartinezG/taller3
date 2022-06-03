package co.edu.unbosque.tinder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

		this.registerView.getLoginBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					String fullName = registerView.getFullNameFld().getText();
					int age = Integer.parseInt(registerView.getAgeFld().getText());
					String nationality = (String) registerView.getNacionalityCbx().getSelectedItem();
					String city = (String) registerView.getCityCbx().getSelectedItem();
					String gender = (String) registerView.getGenderCbx().getSelectedItem();
					String description = registerView.getDescriptionFld().getText();

					String userName = registerView.getUserFld().getText();
					char[] password = registerView.getPasswordFld().getPassword();

					profile.setName(fullName);
					profile.setAge(age);
					profile.setNationality(nationality);
					profile.setCity(city);
					profile.setGender(gender);
					profile.setDescription(description);

					user.setUser(userName);
					user.setPassword(password);
					user.setProfile(profile);

					userModel.createUser(user, userDB);

					System.out.println(userDB);

				} catch (Exception e1) {
					System.out.println("Error inesperado");
					e1.printStackTrace();
				}
			}

		});
	}

}
