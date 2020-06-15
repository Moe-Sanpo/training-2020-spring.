package example.training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import example.training.model.employee.Employee;
import example.training.service.employee.EmployeeService;

@Controller
@RequestMapping("employee/delete")
public class EmployeeDeleteController {

	@Autowired
	EmployeeService employeeService;


	@GetMapping("{employeeId:\\d+}")
	public String confirm(@PathVariable Integer employeeId,Model model) {
		Employee employee = employeeService.findById(employeeId);
		model.addAttribute("employee", employee);
		model.addAttribute("employeeId", employeeId);
		return "employee/delete/confirm";
	}

	@PostMapping("execute")
	public String delete(Employee employee) {
		employeeService.delete(employee);
		return "redirect:/employee";
	}

}
