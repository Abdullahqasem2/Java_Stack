package com.example.License.Repoisotory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.License.Model.Person;

@Repository
public interface PersonRepo extends CrudRepository<Person, Long> {
	
	List<Person> findAll();
	List<Person> findByLicenseIdIsNull();

}
