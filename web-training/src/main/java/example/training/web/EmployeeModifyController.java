package example.training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import example.training.model.department.DepartmentList;
import example.training.model.employee.Employee;
import example.training.service.department.DepartmentService;
import example.training.service.employee.EmployeeService;

@Controller
@RequestMapping("employee/modify")
public class EmployeeModifyController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private DepartmentService departmentService;

	@GetMapping("{employeeId:\\d+}")
	public String form(@PathVariable Integer employeeId,Model model) {
		Employee employee = employeeService.findById(employeeId);
		DepartmentList departmentList = departmentService.listOf();
		model.addAttribute("departmentList", departmentList);
		model.addAttribute("employee", employee);
		return "employee/modify/form";
	}

	@PostMapping("{employeeId:\\d+}")
	public String confirm(@PathVariable Integer employeeId,@ModelAttribute @Validated Employee employee,BindingResult result,Model model) {
		DepartmentList departmentList = departmentService.listOf();
		model.addAttribute("departmentList", departmentList);
		model.addAttribute("employee", employee);
		if(result.hasErrors()) {
			return "employee/edit";
		}
		return "employee/modify/confirm";
	}

	@PostMapping("execute/{employeeId:\\d+}")
	public String modify(Employee employee,@PathVariable Integer employeeId,Model model) {
		employeeService.modify(employee);
		return "redirect:/employee/" + employeeId;
	}
}
