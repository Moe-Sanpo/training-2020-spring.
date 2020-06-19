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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import example.training.model.department.DepartmentList;
import example.training.model.employee.Employee;
import example.training.service.department.DepartmentService;
import example.training.service.employee.EmployeeService;

@Controller
@RequestMapping("employee/modify/{employeeId:\\d+}")
public class EmployeeModifyController {

//フィールド
	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private DepartmentService departmentService;

//ModelAttribute
	@ModelAttribute
	public DepartmentList DepartmentList() {
		DepartmentList departmentList = departmentService.listOf();
		return departmentList;
	}

	@ModelAttribute
	public Employee employee(@PathVariable Integer employeeId) {
		Employee employee = employeeService.findById(employeeId);
		return employee;
	}

//Get・Post
	@GetMapping()
	public String form(Model model) {
		return "employee/modify/form";
	}

	@PostMapping()
	public String confirm(@ModelAttribute @Validated Employee employee,BindingResult result,Model model) {
		if(result.hasErrors()) {
			return "employee/modify/edit";
		}
		return "employee/modify/confirm";
	}

	@PostMapping("/execute")
	public String modify(Employee employee,Model model) {
		employeeService.modify(employee);
		return "redirect:/employee/" + employee.getId().getValue();
	}

	@PostMapping("/back")
	public String backFrom(Employee employee,RedirectAttributes redirecutAttributes) {
		redirecutAttributes.addFlashAttribute("employee", employee);
		return "redirect:/employee/modify/"+ employee.getId().getValue();
	}
}
