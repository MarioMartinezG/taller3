package co.edu.unbosque.tinder.model;

import java.util.ArrayList;
import java.util.Arrays;

public class UserModel {
	private String username;
	private char[] password;
	private ProfileModel profile;
	private PreferenceModel preference;
	private ArrayList<UserModel> likedUsers = new ArrayList<UserModel>();
	
	/**
	 * @param username
	 * @param password
	 * @param profile
	 * @param preference
	 */
	public UserModel(String username, char[] password, ProfileModel profile, PreferenceModel preference) {
		this.username = username;
		this.password = password;
		this.profile = profile;
		this.preference = preference;
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
	public char[] getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(char[] password) {
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
	 * @return the likedUsers
	 */
	public ArrayList<UserModel> getLikedUsers() {
		return likedUsers;
	}

	/**
	 * @param likedUsers the likedUsers to set
	 */
	public void setLikedUsers(ArrayList<UserModel> likedUsers) {
		this.likedUsers = likedUsers;
	}

	/**
	 * @param username
	 * @param password
	 * @param userDB
	 * @return login
	 */
	public UserModel login(String username, char[] password, ArrayList<UserModel> userDB) {
		for (UserModel user : userDB) {
			if (username.equals(user.getUser()) && Arrays.equals(password, user.getPassword())) {
				return user;
			}
		}

		return null;
	}

	public void createUser(UserModel user, ArrayList<UserModel> userDB) {
		userDB.add(user);
	}

	@Override
	public String toString() {
		return "UserModel [username=" + username + ", password=" + password.toString() + ", profile=" + profile + "]";
	}

}
