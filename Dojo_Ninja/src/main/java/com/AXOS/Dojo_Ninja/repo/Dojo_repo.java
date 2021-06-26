package com.AXOS.Dojo_Ninja.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AXOS.Dojo_Ninja.models.Dojo;

@Repository
public interface Dojo_repo extends CrudRepository<Dojo, Long>{
	List<Dojo> findAll();
}
