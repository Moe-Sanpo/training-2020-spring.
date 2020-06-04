package helloworld.model.person;

public enum Gender {
	MALE("男性"),
	FEMALE("女性"),
	OTHER("その他");

	private String label;

	private Gender(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}