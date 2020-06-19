package example.training.datasource.department;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import example.training.model.department.DepartmentList;
import example.training.model.department.DepartmentRepositry;

@Repository
public class DepartmentDataSource implements DepartmentRepositry,Serializable {

	private static final long serialVersionUID = 8571841944557055697L;

	@Autowired DepartmentMapper departmentMapper;

	@Override
	public DepartmentList listOf() {
		return new DepartmentList(departmentMapper.listOf());
	}

}
