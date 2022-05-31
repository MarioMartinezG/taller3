package co.edu.unbosque.tinder.controller;

import java.util.ArrayList;

import co.edu.unbosque.tinder.model.UserModel;
import co.edu.unbosque.tinder.view.MainView;

public class LoginController {
	private MainView mainView;

	/**
	 * @param mainView
	 */
	public LoginController(MainView mainView) {
		this.mainView = mainView;
	}

	static ArrayList<UserModel> userDB = new ArrayList<>();

}
