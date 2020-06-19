package example.training.model.department;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DepartmentList implements Serializable{

	private static final long serialVersionUID = -8170452198686786205L;

	private List<Department> values;

	public DepartmentList(List<Department> values) {
		super();
		this.values = values;
	}

	public DepartmentList() {
		this.values = new ArrayList<Department>();
	}

	public List<Department> getValues() {
		return values;
	}

	public void setValues(List<Department> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "DepartmentList [values=" + values + "]";
	}

	public DepartmentName departmentNameById(Integer id) {
		for(Department department : values) {
			if(id.equals(department.getId().getValue())) {
				return department.getName();
			}
		}
		return new DepartmentName();
	}

}
