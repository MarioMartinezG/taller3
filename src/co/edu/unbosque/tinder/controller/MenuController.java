package co.edu.unbosque.tinder.controller;

import co.edu.unbosque.tinder.model.UserModel;
import co.edu.unbosque.tinder.view.MenuView;

public class MenuController {
	private MenuView menuView;
	private UserModel user;

	public MenuController(MenuView menuView, UserModel loggedUser) {
		// TODO Auto-generated constructor stub
		this.menuView = menuView;
		this.user = loggedUser;
		
		if(this.user.getProfile() == null) {
			// Setear campos del perfil como vacíos
		} else {
			// Setear campos del perfil con los datos del perfil del usuario logueado
		}
		
		
	}

}
