package example.training.model.employee;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class EmployeeName implements Serializable{

	private static final long serialVersionUID = -2592418281166105294L;

	@NotBlank
	@Size(max = 10 ,min=1)
	private String firstName;
	@NotBlank
	@Size(max = 10 ,min=1)
	private String lastName;

	public EmployeeName(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public EmployeeName() {
		this.firstName = "";
		this.lastName = "";
	}

	public String fullName() {
		return String.format("%s %s", lastName,firstName);
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
		return String.format("EmployeeName [firstName=%s, lastName=%s]", firstName, lastName);
	}


}
