package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "Users")
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String email;
	
	private String login;
	
	private String name;
	
	private String password;
	
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", login=" + login + ", name=" + name + ", password=" + password
				+ ", age=" + age + "]";
	}

	public User(String email, String login, String name, String password, int age) {
		super();
		this.email = email;
		this.login = login;
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	
}
