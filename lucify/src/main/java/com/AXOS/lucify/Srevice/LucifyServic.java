package com.AXOS.lucify.Srevice;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.AXOS.lucify.Reprosirory.LucifyRepo;
import com.AXOS.lucify.model.Lucify;

@Service
public class LucifyServic {
	private final LucifyRepo lucifyRepo;

	public LucifyRepo getLucifyRepo() {
		return lucifyRepo;
	}

	public LucifyServic(LucifyRepo lucifyRepo) {
		this.lucifyRepo = lucifyRepo;
	}

	public Iterable<Lucify> allLucify() {
		return lucifyRepo.findAll();
	}

	public Lucify findLucify(Long id) {
		java.util.Optional<Lucify> optionalLucify = lucifyRepo.findById(id);
		if (optionalLucify.isPresent()) {
			return optionalLucify.get();
		} else {
			return null;
		}
	}

	public Lucify ceateLucify(Lucify l) {
		return lucifyRepo.save(l);
	}

	public Lucify delete(Long id) {
		lucifyRepo.deleteById(id);
		return null;
	}

	public @Valid Lucify updateLucify(@Valid Lucify luc) {
		return lucifyRepo.save(luc);

	}

	public Iterable<Lucify> topTenByRating() {
		return lucifyRepo.findTop10ByOrderByRatingDesc();
	}

	public Iterable<Lucify> songsContainingArtist(String luc) {
		return lucifyRepo.findByArtistContaining(luc);
	}
}
