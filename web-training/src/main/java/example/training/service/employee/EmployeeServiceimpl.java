package example.training.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeList;
import example.training.model.employee.EmployeeRepositry;
import example.training.model.employee.criteria.EmployeeListCriteria;
import example.training.model.fandamental.exception.ResourceNotFoundException;

@Service
public class EmployeeServiceimpl implements EmployeeService {

	@Autowired
	private EmployeeRepositry employeeRepositry;

	@Override
	public Employee findById(Integer employeeId) {

		Employee employee =employeeRepositry.findById(employeeId);
		if(employee == null) {
			throw new ResourceNotFoundException();
		}
		return employee;
	}

	@Override
	public EmployeeList listOf() {
		return employeeRepositry.listOf();
	}

	@Override
	public EmployeeList listOf(EmployeeListCriteria criteria) {

		return employeeRepositry.listOf(criteria);
	}



}

