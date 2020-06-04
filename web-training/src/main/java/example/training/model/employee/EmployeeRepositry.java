package example.training.model.employee;

public interface EmployeeRepositry {
	public Employee findById(Integer employeId);
	public Employee findByList();
}
