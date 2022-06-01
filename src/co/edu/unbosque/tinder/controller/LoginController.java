package co.edu.unbosque.tinder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import co.edu.unbosque.tinder.model.UserModel;
import co.edu.unbosque.tinder.view.MainView;
import co.edu.unbosque.tinder.view.MenuView;

public class LoginController {
	static ArrayList<UserModel> userDB = new ArrayList<>();

	private MainView mainView;

	/**
	 * @param mainView
	 * @param userModel
	 */
	public LoginController(MainView mainView, UserModel userModel) {
		this.mainView = mainView;
		this.mainView.getRegistarBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					String username = mainView.getUserFld().getText();
					String password = mainView.getContraseñaFld().getText();

					userModel.createUser(username, password, userDB);

					System.out.println("Usuarios registrados: " + userDB);

				} catch (Exception e1) {
					System.out.println("Error inesperado");
					e1.printStackTrace();
				}

			}

		});
		
		this.mainView.getLoginBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					String username = mainView.getUserFld().getText();
					String password = mainView.getContraseñaFld().getText();

					UserModel loggedUser = userModel.login(username, password, userDB);
					if (loggedUser != null) { 
						new MenuController(new MenuView(loggedUser), loggedUser); 
						System.out.println("Usuario encontrado!!!"); 
					} else {
						mainView.showErrorMessage("Nombre de Usuario o Contraseña incorrecto."); 
					}	
				} catch (Exception e1) {
					System.out.println("Error inesperado");
					e1.printStackTrace();
				}
			}

		}); 

	}

}
