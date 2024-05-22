package edu.training.web.bean;

import java.io.Serializable;
import java.util.Objects;

public class UserRegInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private String login;
	private String password;

	public UserRegInfo() {

	}

	public UserRegInfo(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public UserRegInfo(String name, String login, String password) {
		super();
		this.name = name;
		this.login = login;
		this.password = password;
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

	public String getName() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(login, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserRegInfo other = (UserRegInfo) obj;
		return Objects.equals(login, other.login) && Objects.equals(password, other.password)
				&& Objects.equals(name, other.name);
	}

}
