package com.AXOS.Dojo_Ninja.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AXOS.Dojo_Ninja.models.Ninja;

@Repository
public interface Ninja_repo extends CrudRepository<Ninja, Long> {
	List<Ninja> findAll();
}
