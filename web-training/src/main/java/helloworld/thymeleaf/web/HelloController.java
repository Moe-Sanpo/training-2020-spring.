package helloworld.thymeleaf.web;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import helloworld.model.Music.Music;
import helloworld.model.Music.MusicId;
import helloworld.model.Music.MusicName;
import helloworld.model.Music.SalesDay;
import helloworld.model.person.DateOfBirth;
import helloworld.model.person.Gender;
import helloworld.model.person.Person;
import helloworld.model.person.PersonName;

@Controller
@RequestMapping("")
public class HelloController {

	@GetMapping("{MusicId:\\d+}")
	public String hello(
			Model model,
			@PathVariable Integer MusicId,
			Model model2){

		Music music = new Music(
				new MusicName("飛行艇"),
				new SalesDay(LocalDate.of(2020,04,29)),
				new MusicId(MusicId));
		model.addAttribute("music", music);

		Person compser = new Person(
				new PersonName("大希", "常田"),
				Gender.MALE,
				new DateOfBirth(LocalDate.of(1992, 05, 15)));
		model2.addAttribute("compser", compser);

		return "music/music";
	}

	@GetMapping("/music")
	public String hello2(Model model2){
		Person compser = new Person(
				new PersonName("大希", "常田"),
				Gender.MALE,
				new DateOfBirth(LocalDate.of(1992, 05, 15)));

		model2.addAttribute("compser", compser);
		return "music/compser";
	}

	@PostMapping("/music")
	public String music(
			@ModelAttribute("firstName") String firstName,
			@ModelAttribute("lastName") String lastName,
			@ModelAttribute("gender") String gender,
			@ModelAttribute("day_of_birth") String day_of_birth,
			Model model
			) {
		PersonName name = new PersonName(firstName, lastName);
		model.addAttribute("name", name.fullName());
		model.addAttribute("gender", gender);
		model.addAttribute("day_of_birth", day_of_birth);

		return "music/compser";
	}
}

