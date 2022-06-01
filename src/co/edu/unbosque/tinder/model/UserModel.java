package co.edu.unbosque.tinder.model;

import java.util.ArrayList;

public class UserModel {
	private String username;
	private String password;
	private ProfileModel profile;
	private PreferenceModel preference;

	/**
	 * @param user
	 * @param password
	 */
	public UserModel(String user, String password) {
		this.setUser(user);
		this.setPassword(password);
	}

	public UserModel() {
		// TODO Auto-generated constructor stub
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

	public PreferenceModel getPreference() {
		return preference;
	}

	public void setPreference(PreferenceModel preference) {
		this.preference = preference;
	}

	/**
	 * @param username
	 * @param password
	 * @param userDB
	 * @return login
	 */
	public UserModel login(String username, String password, ArrayList<UserModel> userDB) {
		for (UserModel user : userDB) {
			if (username.equals(user.getUser()) && password.equals(user.getPassword())) {
				return user;
			}
		}

		return null;
	}

	public void createUser(String username, String password, ArrayList<UserModel> userDB) {
		UserModel newUser = new UserModel(username, password);

		userDB.add(newUser);
	}

	@Override
	public String toString() {
		return "UserModel [username=" + username + ", password=" + password + ", profile=" + profile + "]";
	}

}
