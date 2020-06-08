package example.training.service.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.training.model.department.DepartmentList;
import example.training.model.department.DepartmentRepositry;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	public DepartmentRepositry departmentRepositry;

	@Override
	public DepartmentList listOf() {
		return departmentRepositry.listOf();
	}

}
