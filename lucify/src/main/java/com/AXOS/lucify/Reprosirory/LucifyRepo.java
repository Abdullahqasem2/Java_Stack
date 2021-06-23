package com.AXOS.lucify.Reprosirory;

import org.springframework.data.repository.CrudRepository;

import com.AXOS.lucify.model.Lucify;

public interface LucifyRepo extends CrudRepository<Lucify, Long> {
	Iterable<Lucify> findAll();

	Iterable<Lucify> findTop10ByOrderByRatingDesc();

	Iterable<Lucify> findByArtistContaining(String loc);
}
