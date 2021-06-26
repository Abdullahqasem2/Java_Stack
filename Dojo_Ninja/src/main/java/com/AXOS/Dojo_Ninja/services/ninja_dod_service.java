package com.AXOS.Dojo_Ninja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.AXOS.Dojo_Ninja.models.Dojo;
import com.AXOS.Dojo_Ninja.models.Ninja;
import com.AXOS.Dojo_Ninja.repo.Dojo_repo;
import com.AXOS.Dojo_Ninja.repo.Ninja_repo;

@Service
public class ninja_dod_service {
	private Dojo_repo dojorepo;
	private Ninja_repo ninjarepo;

	public ninja_dod_service(Dojo_repo dojorepo, Ninja_repo ninjarepo) {
		this.dojorepo = dojorepo;
		this.ninjarepo = ninjarepo;
	}

	public Dojo saveDojo(Dojo dojo) {
		return dojorepo.save(dojo);
	}

	public Ninja saveNinja(Ninja ninja) {
		return ninjarepo.save(ninja);
	}

	public List<Dojo> allDojo() {
		return dojorepo.findAll();
	}

	public List<Ninja> allNinja() {
		return ninjarepo.findAll();
	}

	public Ninja findNinja(Long id) {
		java.util.Optional<Ninja> check = ninjarepo.findById(id);
		if (check.isPresent()) {
			return check.get();
		} else {
			return null;
		}
	}

	public Dojo findDojo(Long id) {
		java.util.Optional<Dojo> check = dojorepo.findById(id);
		if (check.isPresent()) {
			return check.get();
		} else {
			return null;
		}
	}

	public Dojo createDojo(Dojo dojo) {
		return dojorepo.save(dojo);
	}

	public Ninja createNinja(Ninja dojo) {
		return ninjarepo.save(dojo);
	}
}
