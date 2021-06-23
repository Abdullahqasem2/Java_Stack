package com.AXOS.Servay;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Form {
	@RequestMapping("/")
	public String Man() {
		return "index.jsp";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam(value = "name") String name, @RequestParam(value = "loc") String loc,
			@RequestParam(value = "comment") String comment, @RequestParam(value = "lan") String lan, Model model) {
		model.addAttribute("result",name);
		model.addAttribute("loc",loc);
		model.addAttribute("lan",lan);
		model.addAttribute("comment",comment);
		return "res.jsp";
	}
}
