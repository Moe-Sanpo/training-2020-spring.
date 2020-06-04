package example.training.datasource.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeRepositry;

@Repository
public class EmployeeDataSource implements EmployeeRepositry{

	@Autowired EmployeeMapper employeeMapper;

	@Override
	public Employee findById(Integer employeId) {

		return employeeMapper.findById(employeId) ;
	}

	@Override
	public Employee findByList() {
		// TODO 自動生成されたメソッド・スタブ
		return employeeMapper.findByList();
	}

}
