package example.training.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeRepositry;
import example.training.model.fandamental.exception.ResourceNotFoundException;

@Service
public class EmployeeServiceimpl implements EmployeeService {

	@Autowired
	private EmployeeRepositry employeeRepositry;

	@Override
	public Employee findById(Integer employeeId) {
		// TODO 自動生成されたメソッド・スタブ

		Employee employee =employeeRepositry.findById(employeeId);
		if(employee == null) {
			throw new ResourceNotFoundException();
		}
		return employee;
	}

	@Override
	public Employee findByList() {
		// TODO 自動生成されたメソッド・スタブ
		return employeeRepositry.findByList();
	}

}
