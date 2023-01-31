package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name", "Dharmendra Tiwari");
		model.addAttribute("id", 201103);

		List<String> friends = new ArrayList<String>();
		friends.add("Pragya");
		friends.add("Manohar");
		friends.add("Shikher");

		model.addAttribute("f", friends);

		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		// creating model and view object
		ModelAndView modelAndView = new ModelAndView();

		// setting the data
		modelAndView.addObject("name", "Dheeru");
		modelAndView.addObject("rollnumber", 1234);

		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);

		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(32);
		list.add(123);
		list.add(56);

		modelAndView.addObject("marks", list);

		// setting the view name
		modelAndView.setViewName("help");

		return modelAndView;
	}
}
