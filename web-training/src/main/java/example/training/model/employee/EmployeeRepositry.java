package example.training.model.employee;

import example.training.model.employee.criteria.EmployeeListCriteria;

public interface EmployeeRepositry {

	public Employee findById(Integer employeId);
	public EmployeeList listOf(EmployeeListCriteria criteria);
	public void register(Employee employee);
	public void modify(Employee employee);
	public void delete(Integer employeeId);

}
