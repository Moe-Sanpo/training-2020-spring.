package example.training.datasource.employee;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeId;
import example.training.model.employee.EmployeeList;
import example.training.model.employee.EmployeeRepositry;
import example.training.model.employee.criteria.EmployeeListCriteria;

@Repository
public class EmployeeDataSource implements EmployeeRepositry,Serializable{

	private static final long serialVersionUID = -2149597447870822898L;

	@Autowired EmployeeMapper employeeMapper;

	@Override
	public Employee findById(Integer employeId) {

		return employeeMapper.findById(employeId) ;
	}

	@Override
	public EmployeeList listOf(EmployeeListCriteria criteria) {
		return new EmployeeList(employeeMapper.listCriteriaOf(criteria));
	}

	@Override
	public void register(Employee employee) {
		EmployeeId employeeId = employeeMapper.nextId();
		//Integer employeeId = employeeMapper.nextId();
		employeeMapper.register(employeeId,employee);
	}

	@Override
	public void modify(Employee employee) {
		employeeMapper.modify(employee);

	}

	@Override
	public void delete(Integer employeeId) {
		EmployeeId id = new EmployeeId(employeeId);
		employeeMapper.delete(id);

	}

}
