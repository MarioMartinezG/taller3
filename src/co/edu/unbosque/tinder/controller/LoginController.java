package co.edu.unbosque.tinder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import co.edu.unbosque.tinder.model.UserModel;
import co.edu.unbosque.tinder.view.MainView;

public class LoginController {
	static ArrayList<UserModel> userDB = new ArrayList<>();

	private MainView mainView;

	/**
	 * @param mainView
	 */
	public LoginController(MainView mainView, UserModel userModel) {
		this.mainView = mainView;

		this.mainView.getLoginBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					String username = mainView.getUserFld().getText();
					String password = mainView.getPasswordFld().getText();

				} catch (Exception e1) {
					System.out.println("Error inesperado");
					e1.printStackTrace();
				}

			}

		});
	}

}
