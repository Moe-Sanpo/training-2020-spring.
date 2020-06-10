package example.training.model.employee.criteria;

import java.util.LinkedHashMap;
import java.util.Map;

public enum EmployeeIdPriority {
	ASC("昇順"),
	DESC("降順");

	private String label;

	private EmployeeIdPriority(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Map<String, String> options(){
		Map<String, String> option = new LinkedHashMap<String, String>();

				for(EmployeeIdPriority employeeIdPriority :EmployeeIdPriority.values()) {
					option.put(employeeIdPriority.name(),employeeIdPriority.getLabel());

				}return option;
	}

	public boolean isDesc() {
		return this.equals(EmployeeIdPriority.DESC);
	}

}
