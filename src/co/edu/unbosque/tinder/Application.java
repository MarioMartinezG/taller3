package co.edu.unbosque.tinder;

import co.edu.unbosque.tinder.controller.LoginController;
import co.edu.unbosque.tinder.model.UserModel;
import co.edu.unbosque.tinder.view.LoginView;
import co.edu.unbosque.tinder.view.MainView;
import co.edu.unbosque.tinder.view.RegisterView;

public class Application {

	public static void main(String[] args) {
		new LoginController(new LoginView(), new UserModel(), new MainView(), new RegisterView());

	}

}
