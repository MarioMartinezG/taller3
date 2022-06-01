package co.edu.unbosque.tinder;

import co.edu.unbosque.tinder.controller.LoginController;
import co.edu.unbosque.tinder.model.UserModel;
import co.edu.unbosque.tinder.view.MainView;

public class Application {

	public static void main(String[] args) {
		new LoginController(new MainView(), new UserModel());

	}

}
