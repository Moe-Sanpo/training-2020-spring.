package example.training.model.employee.criteria;

import example.training.model.department.DepartmentId;


public class EmployeeListCriteria {

	private DepartmentId departmentId;
	private EmployeeIdPriority employeeIdPriority;


	public EmployeeListCriteria(DepartmentId departmentId, EmployeeIdPriority employeeIdPriority) {
		super();
		this.departmentId = departmentId;
		this.employeeIdPriority = employeeIdPriority;

	}

	public EmployeeListCriteria() {
		employeeIdPriority = EmployeeIdPriority.ASC;
		departmentId = new DepartmentId();

	}

	public DepartmentId getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(DepartmentId departmentId) {
		this.departmentId = departmentId;
	}


	public EmployeeIdPriority getEmployeeIdPriority() {
		return employeeIdPriority;
	}

	public void setEmployeeIdPriority(EmployeeIdPriority employeeIdPriority) {
		this.employeeIdPriority = employeeIdPriority;
	}



	public boolean isEmpty() {

		return departmentId.isEmpty();
	}

	public boolean notEmpty(){
		return !departmentId.isEmpty();
	}

	public boolean isDesc() {
		return employeeIdPriority.isDesc();
	}



	@Override
	public String toString() {
		return "EmployeeListCriteria [departmentId=" + departmentId + ", employeeIdPriority=" + employeeIdPriority
				+ "]";
	}


}
