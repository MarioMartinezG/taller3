package co.edu.unbosque.tinder.model;

import java.util.ArrayList;

import javax.swing.Icon;

public class ProfileModel {
	private String name;
	private int age;
	private String nationality;
	private String city;
	private String gender;
	private String description;
	private Icon profilePic;
	private String dummyProfPic;
	private ArrayList<UserModel> likedUser; 

	/**
	 * @param name
	 * @param age
	 * @param nationality
	 * @param city
	 * @param gender
	 * @param description
	 * @param profilePic
	 * @param dummyProfPic
	 */
	public ProfileModel(String name, int age, String nationality, String city, String gender, String description,
			String dummyProfPic) {
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.city = city;
		this.gender = gender;
		this.description = description;
		this.dummyProfPic = dummyProfPic;
	}

	public ProfileModel() {

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the profilePic
	 */
	public Icon getProfilePic() {
		return profilePic;
	}

	/**
	 * @param profilePic the profilePic to set
	 */
	public void setProfilePic(Icon profilePic) {
		this.profilePic = profilePic;
	}

	/**
	 * @return the dummyProfPic
	 */
	public String getDummyProfPic() {
		return dummyProfPic;
	}

	/**
	 * @return the likedUser
	 */
	public ArrayList<UserModel> getLikedUser() {
		return likedUser;
	}

	@Override
	public String toString() {
		return "ProfileModel [name=" + name + ", age=" + age + ", nationality=" + nationality + ", city=" + city
				+ ", gender=" + gender + ", description=" + description + ", profilePic=" + profilePic + "]";
	}

}
