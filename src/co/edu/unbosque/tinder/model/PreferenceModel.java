package co.edu.unbosque.tinder.model;

public class PreferenceModel {
	private int minAge;
	private int maxAge;
	private String[] gender;
	private String[] city;

	public PreferenceModel() {
		// TODO Auto-generated constructor stub
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public String[] getGender() {
		return gender;
	}

	public void setGender(String[] gender) {
		this.gender = gender;
	}

	public String[] getCity() {
		return city;
	}

	public void setCity(String[] city) {
		this.city = city;
	}
}
