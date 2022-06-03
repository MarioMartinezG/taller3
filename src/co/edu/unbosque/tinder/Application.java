package co.edu.unbosque.tinder;

import co.edu.unbosque.tinder.controller.MainController;
import co.edu.unbosque.tinder.view.MainView;

public class Application {

	public static void main(String[] args) {
		new MainController(new MainView());
	}

}
