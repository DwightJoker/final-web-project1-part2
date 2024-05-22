package edu.training.web.bean;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class UserProfile implements Serializable{
	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String gender;
	private String login;
	private String password;
	
	public UserProfile() {
		super();	
	}

	public UserProfile(String firstName, String lastName, LocalDate dateOfBirth, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}

	public UserProfile(String firstName, String lastName, LocalDate dateOfBirth, String gender,
			String login, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.login = login;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, firstName, gender, lastName, login, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserProfile other = (UserProfile) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(gender, other.gender) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(login, other.login) && Objects.equals(password, other.password);
	}
	
	

}
