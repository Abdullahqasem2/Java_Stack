package com.example.License.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.License.Model.License;
import com.example.License.Model.Person;
import com.example.License.Service.ServiceAll;

@Controller
public class ControllerLicense {
	private ServiceAll SL;

	public ControllerLicense(ServiceAll sL) {

		SL = sL;
	}

	@RequestMapping("/")
	public String index(@ModelAttribute("person") Person person) {
		return "new.jsp";
	}

	@RequestMapping("/AddLicenses")
	public String index2(@ModelAttribute("licenses") License license, Model m) {
		List<Person> unlicensed = SL.getUnlicensedPeople();
		m.addAttribute("persons", unlicensed);
		return "newlicense.jsp";
	}

	@RequestMapping(value = "/AddPerson", method = RequestMethod.POST)
	public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "new.jsp";
		} else {
			SL.createPerson(person);
			return "redirect:/AddLicenses";
		}
	}

	@RequestMapping(value = "/AddLicenses2", method = RequestMethod.POST)
	public String createLicenses(@Valid @ModelAttribute("licenses") License licenses, BindingResult result,Model m) {
		List<Person> unlicensed = SL.getUnlicensedPeople();
		m.addAttribute("persons", unlicensed);
		if (result.hasErrors()) {
			return "newlicense.jsp";
		} else {
			SL.creatLicense(licenses);
			return "redirect:/AddLicenses";
		}

	}
//	@RequestMapping("/{id}")
//	public String ShowPerson(@PathVariable("id") Long id, Model model) {
//		model.addAttribute("person", SL.getPerson(id));
//		return "show.jsp";
//	}
	@RequestMapping("/info")
	public String show(Model m) {
		List <License> L = SL.findAllLicense();
		List <Person> p = SL.findAllPerson();
		m.addAttribute("License", L);
		m.addAttribute("person", p);
		return "show.jsp";
	}
		
//		
		
		
	

}
