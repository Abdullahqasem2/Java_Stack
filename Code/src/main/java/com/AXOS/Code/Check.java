package com.AXOS.Code;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Check {
	@RequestMapping("/")
	public String Man() {
		return "index.jsp";
	}
	private Boolean isCorrectCode(String guess) {
		return guess.equals("bushido");
	}
	@RequestMapping(value = "/check", method = RequestMethod.POST)
	public String Res(@RequestParam(value = "code") String cod, Model model, RedirectAttributes rAttributes) {
		
	if(isCorrectCode(cod)) {
		return "redirect:/code";
	}
	rAttributes.addFlashAttribute("error", "You can try harder");
	return "redirect:/";	

	}
	@RequestMapping("/code")
	public String Fine() {
		return "res.jsp";
	}
}