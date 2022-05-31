package co.edu.unbosque.tinder.model;

import java.util.ArrayList;

public class UserModel {
	private String username;
	private String password;
	private ProfileModel profile;

	/**
	 * @param user
	 * @param password
	 */
	public UserModel(String user, String password) {
		this.setUser(user);
		this.setPassword(password);
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return username;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.username = user;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the profile
	 */
	public ProfileModel getProfile() {
		return profile;
	}

	/**
	 * @param profile the profile to set
	 */
	public void setProfile(ProfileModel profile) {
		this.profile = profile;
	}
	
	public boolean login(String username, String password, ArrayList<UserModel> userDB) {
		
		return true;
	}

}
