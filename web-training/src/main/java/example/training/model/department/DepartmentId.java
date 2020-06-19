package example.training.model.department;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class DepartmentId implements Serializable {

	private static final long serialVersionUID = 1057076468907700668L;

	@NotNull
	private Integer value;

	public DepartmentId(Integer value) {
		super();
		this.value = value;
	}

	public DepartmentId() {
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("DepartmentId [value=%s]", value);
	}

	public boolean isEmpty() {
		if(value == null) {
			return true;
		}
		return false;
	}

	public boolean notEmpty(){
		return !isEmpty();
	}

}

