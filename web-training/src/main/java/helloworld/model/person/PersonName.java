package helloworld.model.person;

public class PersonName {
	private String firstName;
	private String lastName;

	public PersonName(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public PersonName() {
		super();
		this.firstName="";
		this.firstName="";
	}

	public String fullName() {
		return String.format("%s %s",lastName,firstName);
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

	@Override
	public String toString() {
		return "PersonName [firstName=" + firstName + ", lastName=" + lastName + "]";
	}


}
