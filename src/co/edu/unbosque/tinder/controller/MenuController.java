package co.edu.unbosque.tinder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.tinder.model.PreferenceModel;
import co.edu.unbosque.tinder.model.UserModel;
import co.edu.unbosque.tinder.view.MainView;
import co.edu.unbosque.tinder.view.MenuView;
import co.edu.unbosque.tinder.view.PreferenceView;

public class MenuController {
	private MenuView menuView;

	public MenuController(MenuView menuView, MainView mainView, UserModel loggedUser) {
		// TODO Auto-generated constructor stub
		this.menuView = menuView;
		
		this.menuView.getPreferenceBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					if (loggedUser.getPreference() != null) {
						new PreferenceController(new PreferenceView(), menuView, loggedUser.getPreference(), loggedUser);
					} else {
						new PreferenceController(new PreferenceView(), menuView, new PreferenceModel(), loggedUser);
					}
					menuView.hideFrame();
				} catch (Exception e1) {
					System.out.println("Error inesperado");
					e1.printStackTrace();
				}
			}
		});
		
		this.menuView.getLogOutBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					mainView.showFrame();
					menuView.hideFrame();
				} catch (Exception e1) {
					System.out.println("Error inesperado");
					e1.printStackTrace();
				}
			}
		});

	}

}
