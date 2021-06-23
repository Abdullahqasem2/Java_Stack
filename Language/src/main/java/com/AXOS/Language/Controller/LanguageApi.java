package com.AXOS.Language.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.AXOS.Language.Models.Language;
import com.AXOS.Language.Service.LanguageService;

@RestController

public class LanguageApi {
	private final LanguageService languageService;

	public LanguageApi(LanguageService languageService) {
		this.languageService = languageService;
	}

	@RequestMapping("/language")
	public Iterable<Language> index() {
		return languageService.allLanguage();
	}

	@RequestMapping(value = "/new/language", method = RequestMethod.POST)
	public Language create(@RequestParam(value = "name") String name, @RequestParam(value = "creator") String creator,
			@RequestParam(value = "version") int version) {

		Language language = new Language(name, creator, version);
		return languageService.ceateLanguage(language);
	}

	@RequestMapping("/show/language/{id}")
	public Language show(@PathVariable("id") Long id) {
		Language language = languageService.findlanguage(id);
		return language;
	}

	@RequestMapping("/delet/{id}")
	public Language delete(@PathVariable(value = "id") Long id) {
		Language language = languageService.delete(id);
		return language;
	}

//	@RequestMapping("/edit/{id}")
//	public Language edit(@PathVariable(value = "id") Long id, @RequestParam(value = "name") String name,
//			@RequestParam(value = "creator") String creator, @RequestParam(value = "version") int version) {
//		Language language = languageService.editLanguage(id, name, creator, version);
//		return language;
//	}
}
