package example.training.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import example.training.model.employee.Employee;
import example.training.service.employee.EmployeeService;

@Controller
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping
	public String employee(Model model) {

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employeeService.findByList());

		model.addAttribute("employeeList",employeeList);
		return "employee/employee-list";
	}

	@GetMapping("{employeeId:\\d+}")
	public String employee(@PathVariable Integer employeeId,Model model) {

		Employee employee = employeeService.findById(employeeId);
		model.addAttribute("employee", employee);
		return "employee/employee";

		}

}
