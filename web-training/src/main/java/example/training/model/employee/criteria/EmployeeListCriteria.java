package example.training.model.employee.criteria;

public class EmployeeListCriteria {

	private String departmentName;

	public EmployeeListCriteria(String departmentName) {
		super();
		this.departmentName = departmentName;
	}

	public EmployeeListCriteria() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "EmployeeListCriteria [departmentName=" + departmentName + "]";
	}

	public boolean isEmpty() {
		return departmentName.isEmpty();
	}

	public boolean notEmpty(){
		return !departmentName.isEmpty();
	}
}
