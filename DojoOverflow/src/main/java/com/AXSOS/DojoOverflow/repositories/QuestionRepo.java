package com.AXSOS.DojoOverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AXSOS.DojoOverflow.models.Question;

@Repository
public interface QuestionRepo extends CrudRepository<Question,Long> {
	List<Question> findAll();

}
