package co.edu.unbosque.tinder.model;

public class UserModel {
	private String user;
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
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
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

}
