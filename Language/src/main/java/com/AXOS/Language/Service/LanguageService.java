package com.AXOS.Language.Service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.AXOS.Language.Models.Language;
import com.AXOS.Language.Reprository.LanguageRebrosetory;

@Service
public class LanguageService {
	private final LanguageRebrosetory languageRebrosetory;

	public LanguageRebrosetory getLanguageRebrosetory() {
		return languageRebrosetory;
	}

	public LanguageService(LanguageRebrosetory languageRebrosetory) {
		this.languageRebrosetory = languageRebrosetory;
	}

	public Iterable<Language> allLanguage() {
		return languageRebrosetory.findAll();
	}

	public Language ceateLanguage(Language l) {
		return languageRebrosetory.save(l);
	}

	public Language findlanguage(Long id) {
		java.util.Optional<Language> optionallanguage = languageRebrosetory.findById(id);
		if (optionallanguage.isPresent()) {
			return optionallanguage.get();
		} else {
			return null;
		}
	}

//	public Language updateLanguage(Language lang) {
//		return languageRebrosetory.save(lang);
//	}

	public Language delete(Long id) {
		languageRebrosetory.deleteById(id);
		return null;
	}

	public @Valid Language updateLanguage(@Valid Language lang) {
		return languageRebrosetory.save(lang);
		
	}

	
}
