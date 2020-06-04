package helloworld.model.person;

public class Person {
	private PersonName name;
	private Gender gender;
	private DateOfBirth day;

	public Person(PersonName name, Gender gender, DateOfBirth day) {
		this.name = name;
		this.gender = gender;
		this.day = day;
	}

	public Person() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public PersonName getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public DateOfBirth getDay() {
		return day;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", label=" + gender + ", day=" + day + "]";
	}


}
