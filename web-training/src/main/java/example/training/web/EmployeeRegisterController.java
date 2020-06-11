package example.training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import example.training.model.department.DepartmentList;
import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeFactory;
import example.training.service.department.DepartmentService;

@Controller
@RequestMapping("employee")
public class EmployeeRegisterController {

	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private EmployeeFactory employeeFactory;


	@GetMapping("/register")
	public String form(Model model) {

		Employee employee = employeeFactory.create();
		DepartmentList departmentList = departmentService.listOf();

		model.addAttribute("departmentList", departmentList);
		model.addAttribute("employee", employee);

		return "employee/form";
	}

	@PostMapping("/register")
	public String comfirm(@ModelAttribute Employee employee,Model model) {
		DepartmentList departmentList = departmentService.listOf();

		model.addAttribute("departmentList", departmentList);
		model.addAttribute("employee", employee);

		return "employee/form";
	}
}