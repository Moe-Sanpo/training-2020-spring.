package example.training.datasource.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeList;
import example.training.model.employee.EmployeeRepositry;
import example.training.model.employee.criteria.EmployeeListCriteria;

@Repository
public class EmployeeDataSource implements EmployeeRepositry{

	@Autowired EmployeeMapper employeeMapper;

	@Override
	public Employee findById(Integer employeId) {

		return employeeMapper.findById(employeId) ;
	}

	@Override
	public EmployeeList listOf() {
		return new EmployeeList(employeeMapper.listOf());
	}

	@Override
	public EmployeeList listOf(EmployeeListCriteria criteria) {
		return new EmployeeList(employeeMapper.listCriteriaOf(criteria));
	}

}
