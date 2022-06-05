package co.edu.unbosque.tinder.controller;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;

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
		this.mainView = mainView;
		final String path = "https://static.apkdojo.com/images/apps/tinder-lite-icon.png";
		
		try {			
			URL url = new URL(path);
			BufferedImage img = ImageIO.read(url);
			img.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
			
			mainView.showImage(url);
		} catch (Exception exp) {
			System.out.println("Error loading remote resource: " + path);
			exp.printStackTrace();
		}
		this.mainView.getLoginBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					new LoginController(new LoginView(), new UserModel(), userDB);
				} catch (Exception e1) {
					System.out.println("Error inesperado");
					e1.printStackTrace();
				}
			}
		});

		this.mainView.getRegisterBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					new RegisterController(new RegisterView(), new UserModel(), new ProfileModel(), userDB);
				} catch (Exception e1) {
					System.out.println("Error inesperado");
					e1.printStackTrace();
				}
			}
		});
	}

}
