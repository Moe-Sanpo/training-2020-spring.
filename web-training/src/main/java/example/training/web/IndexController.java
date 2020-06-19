package example.training.web;

//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class IndexController {

	@GetMapping
	public String index(Model model) {

		return "index";
	}

	@GetMapping("greeting")
	public String greeting(Model model) {
					return "greeting";
				}

}
