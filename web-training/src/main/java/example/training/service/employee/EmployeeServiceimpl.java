package example.training.service.employee;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeList;
import example.training.model.employee.EmployeeRepositry;
import example.training.model.employee.criteria.EmployeeListCriteria;
import example.training.model.fandamental.exception.ResourceNotFoundException;

@Service
public class EmployeeServiceimpl implements EmployeeService,Serializable {

	private static final long serialVersionUID = 8913752283293978073L;

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
	public EmployeeList listOf(EmployeeListCriteria criteria) {

		return employeeRepositry.listOf(criteria);
	}


	@Override
	public void register(Employee employee) {
		employeeRepositry.register(employee);
	}


	@Override
	public void modify(Employee employee) {
		employeeRepositry.modify(employee);

	}


	@Override
	public void delete(Integer employeeId) {
		employeeRepositry.delete(employeeId);

	}



}

