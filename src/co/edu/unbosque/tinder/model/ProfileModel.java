package co.edu.unbosque.tinder.model;

public class ProfileModel {
	private String name;
	private int age;
	private String nationality;
	private String city;
	private String gender;
	private String description;

	/**
	 * @param name
	 * @param age
	 * @param nationality
	 * @param city
	 * @param gender
	 * @param description
	 */
	/*
	public ProfileModel(String name, int age, String nationality, String city, String gender, String description) {
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.city = city;
		this.gender = gender;
		this.description = description;
	}
	*/
	
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

	@Override
	public String toString() {
		return "ProfileModel [name=" + name + ", age=" + age + ", nationality=" + nationality + ", city=" + city
				+ ", gender=" + gender + ", description=" + description + "]";
	}

}
