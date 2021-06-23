package com.AXOS.Language.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.AXOS.Language.Models.Language;
import com.AXOS.Language.Service.LanguageService;

@Controller
public class LAnguageContoller {
	private final LanguageService lanService;
	public LAnguageContoller(LanguageService lanService) {
        this.lanService = lanService;
    }
	@RequestMapping("/languages")
    public String index(@ModelAttribute("lang") Language lang,Model model) {
        Iterable<Language> lan =  lanService.allLanguage();
        model.addAttribute("lan", lan);
        return "index.jsp";
    }
	@RequestMapping(value="/creat", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("lang") Language lang, BindingResult result) {
        if (result.hasErrors()) {
            return "index.jsp";
        } else {
        	lanService.ceateLanguage(lang);
            return "redirect:/languages";
        }
    }
	 @RequestMapping("/edit/{id}")
	    public String edit(@PathVariable("id") Long id, Model model) {
	        Language lang = lanService.findlanguage(id);
	        model.addAttribute("lang", lang);
	        return"edit.jsp";
	    }
	@RequestMapping(value="/updat/{id}", method=RequestMethod.POST)
    public String upaate(@Valid @ModelAttribute("lang") Language lang, BindingResult result) {
        if (result.hasErrors()) {
            return "index.jsp";
        } else {
        	lanService.updateLanguage(lang);
            return "redirect:/languages";
        }
    }
	@RequestMapping(value="/delete/{id}" )
	public String delet(@PathVariable("id") Long id) {
		lanService.delete(id);
		return "redirect:/languages";
	}
	@RequestMapping(value="/show/{id}")
	public String sho(@PathVariable("id") Long id, Model model) {
		Language lang = lanService.findlanguage(id);
		model.addAttribute("lang", lang);
		return "show.jsp";
	}
	
}
