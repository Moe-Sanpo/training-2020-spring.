package example.training.model.employee;

import example.training.model.department.DepartmentId;
import example.training.model.department.DepartmentName;

public class EmployeeDepartment {
	private DepartmentId id;
	private DepartmentName name;

	public EmployeeDepartment(DepartmentId id, DepartmentName name) {
		super();
		this.id = id;
		this.name = name;
	}


	public EmployeeDepartment() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public DepartmentId getId() {
		return id;
	}

	public DepartmentName getName() {
		return name;
	}

	@Override
	public String toString() {
		return String.format("EmployeeDepartment [Id=%s, name=%s]", id, name);
	}


}