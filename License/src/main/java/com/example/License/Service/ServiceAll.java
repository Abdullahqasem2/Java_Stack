package com.example.License.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.License.Model.License;
import com.example.License.Model.Person;
import com.example.License.Repoisotory.LicensrRepo;
import com.example.License.Repoisotory.PersonRepo;

@Service
public class ServiceAll {
	private final LicensrRepo LR;
	private final PersonRepo PR;
	public ServiceAll(LicensrRepo lR, PersonRepo pR) {
		LR = lR;
		PR = pR;
	}
	
	public List<License> findAllLicense() {
		return LR.findAll();
	}
	
	public List<Person> findAllPerson() {
		return PR.findAll();
	}
	 
	public Person createPerson(Person p) {
		return PR.save(p);
	}
	public License creatLicense(License l) {
		return LR.save(l);
	}
	public List<Person> getUnlicensedPeople() {
		return PR.findByLicenseIdIsNull();
	}
	public Person findPersonById(Long id) {
		Optional<Person> O=PR.findById(id);
		if(O.isPresent())
			return O.get();
		else {
			return null;
		}
		
	}
	public Person getPerson(Long id) {
		return PR.findById(id).orElse(null);
	}
	
	
}
