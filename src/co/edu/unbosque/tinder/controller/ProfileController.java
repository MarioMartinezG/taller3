package co.edu.unbosque.tinder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import co.edu.unbosque.tinder.model.UserModel;
import co.edu.unbosque.tinder.view.MenuView;
import co.edu.unbosque.tinder.view.ProfileView;

public class ProfileController {

	private ProfileView profileView;
	private int userIndex = 0;
	private ArrayList<UserModel> userDB;

	public ProfileController(ProfileView profileView, MenuView menuView, UserModel loggedUser,
			ArrayList<UserModel> userDB) {
		// TODO Auto-generated constructor stub
		this.profileView = profileView;
		this.userDB = userDB;

		if (getCurrentUser().equals(loggedUser)) {
			profileView.setUserValues(nextUser());
		} else {
			profileView.setUserValues(getCurrentUser());
		}

		this.profileView.getNextBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				UserModel user = nextUser();
				
				if (!user.equals(loggedUser)) {
					profileView.setUserValues(user);
				} else {
					profileView.setUserValues(nextUser());
				}
			}
		});

		this.profileView.getPreviousBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				UserModel user = previousUser();
				
				if (!user.equals(loggedUser)) {
					profileView.setUserValues(user);
				} else {
					profileView.setUserValues(previousUser());
				}
			}
		});
		
		this.profileView.getLikeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loggedUser.getLikedUsers().add(getCurrentUser());
				System.out.println("LIKES: " + loggedUser.getLikedUsers());
			}
		});

		this.profileView.getReturnBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					profileView.hideFrame();
					menuView.showFrame();
				} catch (Exception e1) {
					System.out.println("Error inesperado");
					e1.printStackTrace();
				}
			}
		});
	}

	private UserModel getCurrentUser() {
		if (userIndex == -1) {
			return null;
		}
		return userDB.get(userIndex);
	}

	private UserModel nextUser() {
		if (userIndex == -1) {
			return null;
		}
		userIndex++;
		userIndex %= userDB.size();
		return userDB.get(userIndex);
	}

	private UserModel previousUser() {
		if (userIndex == -1) {
			return null;
		}
		userIndex--;
		userIndex += userDB.size();
		userIndex %= userDB.size();
		return userDB.get(userIndex);
	}
	
	private boolean isUserLiked(ArrayList<UserModel> likedUsers, UserModel currentUser) {
			for(UserModel likedUser : likedUsers) {
				if(currentUser.equals(likedUser)) {
					return true;
				}
			}
		return false;
	}
}
