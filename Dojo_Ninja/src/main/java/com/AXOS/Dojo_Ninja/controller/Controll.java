package com.AXOS.Dojo_Ninja.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.AXOS.Dojo_Ninja.models.Dojo;
import com.AXOS.Dojo_Ninja.models.Ninja;
import com.AXOS.Dojo_Ninja.services.ninja_dod_service;

@Controller
public class Controll {
	private final ninja_dod_service nds;

	public ninja_dod_service getnds() {
		return nds;
	}

	public Controll(ninja_dod_service nds) {
		this.nds = nds;
	}

	@GetMapping("/")
	public String NotHere() {
		return "redirect:/dojos/new";
	}

	@GetMapping("/dojos/new")
	public String Form(@ModelAttribute("dojo") Dojo dojo,Model model) {
		model.addAttribute("dojos", nds.allDojo());
		return "create_dojo.jsp";
	}

	@PostMapping("/dojos/new")
	public String creteDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "create_dojo.jsp";
		} else {
			nds.saveDojo(dojo);
			return "redirect:/";
		}
	}

	@GetMapping("/ninjas/new")
	public String ninjaForm(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", nds.allDojo());
		return "create_ninja.jsp";
	}

	@PostMapping("/ninjas/new")
	public String creteDojo(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("dojos", nds.allDojo());
			return "create_ninja.jsp";
		} else {
			nds.saveNinja(ninja);
			return "redirect:/ninjas/new";
		}
	}
	@GetMapping("/dojos/{id}")
	public String dashPoard( Model model) {
		model.addAttribute("dojo", nds.allNinja());
		return "show.jsp";
	}
}
