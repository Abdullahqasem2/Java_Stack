package com.AXOS.Language.Reprository;

import org.springframework.data.repository.CrudRepository;

import com.AXOS.Language.Models.Language;

public interface LanguageRebrosetory extends CrudRepository<Language, Long> {
	// to find all languages
	Iterable<Language> findAll();
}
