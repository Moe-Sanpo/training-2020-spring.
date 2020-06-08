package helloworld.model.person;

import java.time.LocalDate;

public class DateOfBirth {
	private LocalDate date;

	public DateOfBirth(LocalDate date) {
		super();
		this.date = date;
	}

	public DateOfBirth() {
		super();
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "DateOfBirth [date=" + date + "]";
	}


}
