package com.AXOS.lucify.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.AXOS.lucify.Srevice.LucifyServic;
import com.AXOS.lucify.model.Lucify;

@Controller
public class controller {
	private final LucifyServic lucifyServic;

	public controller(LucifyServic lucifyServic) {
		this.lucifyServic = lucifyServic;
	}

	@RequestMapping("/")
	public String indexwelcom(@ModelAttribute("lucy") Lucify lucy, Model model) {
		Iterable<Lucify> luc = lucifyServic.allLucify();
		model.addAttribute("luc", luc);
		return "index.jsp";
	}
	@RequestMapping("/song/new")
	public String indexcreate(@ModelAttribute("lucy") Lucify lucy, Model model) {
		Iterable<Lucify> luc = lucifyServic.allLucify();
		model.addAttribute("luc", luc);
		return "create.jsp";
	}

	@RequestMapping("/dash")
	public String index(@ModelAttribute("lucy") Lucify lucy, Model model) {
		Iterable<Lucify> luc = lucifyServic.allLucify();
		model.addAttribute("luc", luc);
		return "dash.jsp";
	}

	@RequestMapping(value = "/creat", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("lucy") Lucify lucy, BindingResult result) {
		if (result.hasErrors()) {
			return "dash.jsp";
		} else {
			lucifyServic.ceateLucify(lucy);
			return "redirect:/dash";
		}
	}

	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Lucify lucy = lucifyServic.findLucify(id);
		model.addAttribute("lucy", lucy);
		return "edit.jsp";
	}

	@RequestMapping(value = "/updat/{id}", method = RequestMethod.POST)
	public String upaate(@Valid @ModelAttribute("lucy") Lucify lucy, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			lucifyServic.updateLucify(lucy);
			return "redirect:/languages";
		}
	}

	@RequestMapping(value = "/delete/{id}")
	public String delet(@PathVariable("id") Long id) {
		lucifyServic.delete(id);
		return "redirect:/dash";
	}

	@RequestMapping(value = "/show/{id}")
	public String sho(@PathVariable("id") Long id, Model model) {
		Lucify lucy = lucifyServic.findLucify(id);
		model.addAttribute("lucy", lucy);
		return "show.jsp";
	}
	@RequestMapping("/topTen")
	public String TopTen(Model model) {
		model.addAttribute("luc", lucifyServic.topTenByRating());
		return "top.jsp";
	}
	@RequestMapping("/search")
	public String Search(@RequestParam("lucy") String lucy, Model model) {
		model.addAttribute("luc",lucifyServic.songsContainingArtist(lucy));
		model.addAttribute("luc", lucy);
		return "search.jsp";
	}
}
