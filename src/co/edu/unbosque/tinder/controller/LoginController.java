package co.edu.unbosque.tinder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import co.edu.unbosque.tinder.model.UserModel;
import co.edu.unbosque.tinder.view.LoginView;
import co.edu.unbosque.tinder.view.MainView;
import co.edu.unbosque.tinder.view.MenuView;

public class LoginController {
	private LoginView loginView;

	/**
	 * @param loginView
	 * @param userModel
	 */
	public LoginController(LoginView loginView, MainView mainView, UserModel userModel, ArrayList<UserModel> userDB) {
		this.loginView = loginView;
		this.loginView.getLoginBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					String username = loginView.getUserFld().getText();
					char[] password = loginView.getPasswordFld().getPassword();

					UserModel loggedUser = userModel.login(username, password, userDB);

					if (loggedUser != null) {
						new MenuController(new MenuView(loggedUser), mainView, loggedUser, userDB);
						loginView.hideFrame();
					} else {
						loginView.showErrorMessage("Username or Password not valid.");
					}
				} catch (Exception e1) {
					System.out.println("Error inesperado");
					e1.printStackTrace();
				}
			}
		});

		this.loginView.getReturnBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loginView.hideFrame();
				mainView.showFrame();
			}
		});
	}
}
