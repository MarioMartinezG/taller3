package co.edu.unbosque.tinder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;

import co.edu.unbosque.tinder.model.PreferenceModel;
import co.edu.unbosque.tinder.model.ProfileModel;
import co.edu.unbosque.tinder.model.UserModel;
import co.edu.unbosque.tinder.view.LoginView;
import co.edu.unbosque.tinder.view.MainView;
import co.edu.unbosque.tinder.view.RegisterView;

public class MainController {
	static ArrayList<UserModel> userDB = new ArrayList<>();

	private MainView mainView;

	/**
	 * @param mainView
	 */
	public MainController(MainView mainView) {
		UserModel user1 = new UserModel("test1", "test1".toCharArray(),
				new ProfileModel("Pepito López", 20, "Colombian", "Medellin", "Male", "Dummy User", "pepito.jpg"),
				new PreferenceModel());
		UserModel user2 = new UserModel("pepita", "pepita".toCharArray(),
				new ProfileModel("Pepita Rodríguez", 30, "Colombian", "Bogota", "Female", "Dummy User", "pepita.jpg"),
				new PreferenceModel());
		UserModel user3 = new UserModel("", "".toCharArray(),
				new ProfileModel("Mengana Álvarez", 18, "Colombian", "Bogota", "Other", "Dummy User", "mengana.jpg"),
				new PreferenceModel());
		UserModel user4 = new UserModel("", "".toCharArray(),
				new ProfileModel("Zutana Puyol", 19, "Mexican", "Cali", "Other", "Dummy User", "zutana.jpg"),
				new PreferenceModel());
		UserModel user5 = new UserModel("", "".toCharArray(),
				new ProfileModel("Paulo Garzón", 25, "Chilean", "Other", "Male", "Dummy User", "garzon.jpg"),
				new PreferenceModel());
		UserModel user6 = new UserModel("", "".toCharArray(),
				new ProfileModel("Fernanda Petro", 27, "Other", "Veracruz", "Female", "Dummy User", "fernanda.jpg"),
				new PreferenceModel());
		UserModel user7 = new UserModel("", "".toCharArray(), new ProfileModel("Carolina Fajardo", 32, "Other",
				"Santiago de Chile", "Female", "Dummy User", "carolina.jpg"), new PreferenceModel());
		UserModel user8 = new UserModel("", "".toCharArray(),
				new ProfileModel("Alvarina Uribe", 40, "Chilean", "Puebla", "Female", "Dummy User", "uribe.jpg"),
				new PreferenceModel());
		UserModel user9 = new UserModel("", "".toCharArray(),
				new ProfileModel("Tulio Triviño", 57, "Mexican", "Bogota", "Male", "Dummy User", "tulio.jpg"),
				new PreferenceModel());
		UserModel user10 = new UserModel("laura", "laura".toCharArray(),
				new ProfileModel("Laura Velandia", 22, "Mexican", "Medellin", "Female", "Dummy User", "laura.jpg"),
				new PreferenceModel());
		UserModel userTest = new UserModel("test", "test".toCharArray(),
				new ProfileModel("Test User", 26, "Other", "Other", "Female", "Dummy User", "descarga.jpg"),
				new PreferenceModel());

		userDB.add(user1);
		userDB.add(user2);
		userDB.add(user3);
		userDB.add(user4);
		userDB.add(user5);
		userDB.add(user6);
		userDB.add(user7);
		userDB.add(user8);
		userDB.add(user9);
		userDB.add(user10);
		userDB.add(userTest);

		this.mainView = mainView;
		final String path = "https://static.apkdojo.com/images/apps/tinder-lite-icon.png";

		try {
			URL url = new URL(path);
			mainView.showImage(url);
		} catch (Exception exp) {
			System.out.println("Error loading remote resource: " + path);
			exp.printStackTrace();
		}
		this.mainView.getLoginBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					new LoginController(new LoginView(), mainView, new UserModel(), userDB);
					mainView.hideFrame();
				} catch (Exception e1) {
					System.out.println("Error inesperado");
					e1.printStackTrace();
				}
			}
		});

		this.mainView.getRegisterBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					new RegisterController(new RegisterView(), mainView, new UserModel(), new ProfileModel(), userDB);
					mainView.hideFrame();
				} catch (Exception e1) {
					System.out.println("Error inesperado");
					e1.printStackTrace();
				}
			}
		});
	}

}
