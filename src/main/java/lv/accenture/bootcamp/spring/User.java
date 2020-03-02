package lv.accenture.bootcamp.spring;

public class User {

	private String fullName;
	private String name;
	private String email;

	public User(String fullName, String name, String email) {
		this.fullName = fullName;
		this.email = email;
		this.name = name;

		// TODO Auto-generated constructor stub

	}

	public String getFullName() {
		return fullName;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

}
