package entities;

public class Person {
	
	private String name;
	private String email;
	private String phone;
	private Boolean confirmed;
	
	public Person() {
		
	}
	
	public Person(String name, String email, String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		confirmed = false;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}
	
	public void setConfirmed(boolean response) {
		confirmed = response;
	}

	public Boolean getConfirmed() {
		return confirmed;
	}
	
}
