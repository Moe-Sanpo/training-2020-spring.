package example.training.model.fandamental;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

public class DateOfBirth implements Serializable {

	private static final long serialVersionUID = -6116889092582373699L;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull
	@Past
	private LocalDate value;

	public DateOfBirth(LocalDate value) {
		super();
		this.value = value;
	}

	public DateOfBirth() {
		super();
	}

	public LocalDate getValue() {
		return value;
	}

	public void setValue(LocalDate value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("DateOfBirth [value=%s]", value);
	}


}
