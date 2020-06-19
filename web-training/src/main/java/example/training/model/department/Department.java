package example.training.model.department;

import java.io.Serializable;

public class Department implements Serializable {

	private static final long serialVersionUID = -5935945788219825534L;

	private DepartmentId id;
	private DepartmentName name;


	public Department(DepartmentId id, DepartmentName name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Department() {
		this.id = new DepartmentId();
		this.name = new DepartmentName();
	}

	public DepartmentId getId() {
		return id;
	}

	public DepartmentName getName() {
		return name;
	}

	public void setId(DepartmentId id) {
		this.id = id;
	}


	public void setName(DepartmentName name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return String.format("Department [id=%s, name=%s]", id, name);
	}



}
