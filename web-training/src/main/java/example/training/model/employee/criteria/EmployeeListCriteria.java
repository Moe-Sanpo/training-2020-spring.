package example.training.model.employee.criteria;

import example.training.model.department.DepartmentId;

public class EmployeeListCriteria {

	private  DepartmentId departmentId;

	public EmployeeListCriteria(DepartmentId departmentId) {
		super();
		this.departmentId = departmentId;
	}

	public EmployeeListCriteria() {
		super();
	}

	public DepartmentId getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(DepartmentId departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "EmployeeListCriteria [departmentId=" + departmentId + "]";
	}

	public boolean isEmpty() {

		return departmentId.isEmpty();
	}

	public boolean notEmpty(){
		return !departmentId.isEmpty();
	}

}
