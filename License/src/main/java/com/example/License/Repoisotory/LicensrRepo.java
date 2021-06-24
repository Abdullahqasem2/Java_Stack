package com.example.License.Repoisotory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.License.Model.License;


@Repository
public interface LicensrRepo  extends CrudRepository<License, Long>{
	
	List<License>findAll();
	

}
