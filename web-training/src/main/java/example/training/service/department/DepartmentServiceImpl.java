package example.training.service.department;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.training.model.department.DepartmentList;
import example.training.model.department.DepartmentRepositry;

@Service
public class DepartmentServiceImpl implements DepartmentService,Serializable {

	private static final long serialVersionUID = 1513266543689459618L;

	@Autowired
	public DepartmentRepositry departmentRepositry;

	@Override
	public DepartmentList listOf() {
		return departmentRepositry.listOf();
	}

}
