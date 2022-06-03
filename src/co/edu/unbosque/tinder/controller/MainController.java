package co.edu.unbosque.tinder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
		// TODO Auto-generated constructor stub
		this.mainView = mainView;
		this.mainView.getLoginBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					new LoginController(new LoginView(), new UserModel(), userDB);
					mainView.hideFrame();
				} catch (Exception e1) {
					System.out.println("Error inesperado");
					e1.printStackTrace();
				}

			}

		});

		this.mainView.getRegistarBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					new RegisterController(new RegisterView(), new UserModel(), new ProfileModel(), userDB);
					mainView.hideFrame();
				} catch (Exception e1) {
					System.out.println("Error inesperado");
					e1.printStackTrace();
				}

			}

		});
	}

}
