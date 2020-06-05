package example.training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeList;
import example.training.model.employee.criteria.EmployeeListCriteria;
import example.training.model.employee.criteria.EmployeeListCriteriaFactory;
import example.training.service.employee.EmployeeService;

@Controller
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private EmployeeListCriteriaFactory criteriaFactory;

	@GetMapping
	public String employees(Model model) {
		EmployeeListCriteria criteria = criteriaFactory.create();
		EmployeeList employeeList = employeeService.listOf();
		model.addAttribute("employeeList",employeeList);
		model.addAttribute("criteria",criteria );
		return "employee/employee-list";
	}


	@PostMapping()
	public String employeesSerch(@ModelAttribute EmployeeListCriteria criteria,Model model) {

		EmployeeList employeeList = employeeService.listOf(criteria);
		model.addAttribute("employeeList",employeeList);
		model.addAttribute("criteria",criteria );
		return "employee/employee-list";
	}


	@GetMapping("{employeeId:\\d+}")
	public String employee(@PathVariable Integer employeeId,Model model) {
		Employee employee = employeeService.findById(employeeId);
		model.addAttribute("employee", employee);
		return "employee/employee";
	}


}
