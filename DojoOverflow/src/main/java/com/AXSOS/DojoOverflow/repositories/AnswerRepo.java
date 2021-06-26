package com.AXSOS.DojoOverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AXSOS.DojoOverflow.models.Answer;

@Repository
public interface AnswerRepo extends CrudRepository<Answer,Long> {

}
