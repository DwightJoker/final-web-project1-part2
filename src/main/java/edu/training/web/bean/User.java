package edu.training.web.bean;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private String role;
	private String id;
	
	public User() {
	}

	public User(String role) {
		super();
		this.role = role;
	}

	public User(String role, String id) {
		super();
		this.role = role;
		this.id = id;
	}

	public User(String name, String role, String id) {
		super();
		this.name = name;
		this.role = role;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, role);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id) && Objects.equals(role, other.role);
	}

}
